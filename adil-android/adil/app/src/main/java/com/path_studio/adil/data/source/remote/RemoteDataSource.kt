package com.path_studio.adil.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.functions.FirebaseFunctions
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.path_studio.adil.data.source.remote.firestore.FirestoreConfig
import com.path_studio.adil.data.source.remote.response.*

class RemoteDataSource {

    private var functions = FirebaseFunctions.getInstance("asia-southeast2")

    companion object {
        @Volatile
        private var instance: RemoteDataSource ? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource()
            }
    }

    fun getCategories(): LiveData<List<CategoryResponse>>{
        val categoryResult = MutableLiveData<List<CategoryResponse>>()
        FirestoreConfig.getFirestoreService().collection("category")
            .get()
            .addOnCompleteListener(OnCompleteListener<QuerySnapshot?> { task ->
                if (task.isSuccessful) {
                    val categoryList = ArrayList<CategoryResponse>()
                    for (category in task.result!!)
                    {
                        // Automap fields to object properties
                        val obj = category.toObject<CategoryResponse>()
                        // Inject document id into object
                        obj.id = category.id
                        categoryList.add(obj)
                    }
                    // Post value back
                    categoryResult.postValue(categoryList)
                } else {
                    Log.w("Category Result", "Error getting documents.", task.exception)
                }
            })
        return categoryResult
    }

    fun getHomeCategories(): LiveData<List<CategoryResponse>>{
        val categoryResult = MutableLiveData<List<CategoryResponse>>()
        FirestoreConfig.getFirestoreService().collection("category")
            .whereEqualTo("isFrontCategory", true)
            .get()
            .addOnCompleteListener(OnCompleteListener<QuerySnapshot?> { task ->
                if (task.isSuccessful) {
                    val categoryList = ArrayList<CategoryResponse>()
                    for (category in task.result!!)
                    {
                        // Automap fields to object properties
                        val obj = category.toObject<CategoryResponse>()
                        // Inject document id into object
                        obj.id = category.id
                        categoryList.add(obj)
                    }
                    // Post value back
                    categoryResult.postValue(categoryList)
                } else {
                    Log.w("Category Result", "Error getting documents.", task.exception)
                }

            })
        return categoryResult
    }

    fun getLegislationByCategory(categoryName: String): LiveData<List<LegislationResponse>>{
        val legislationResult = MutableLiveData<List<LegislationResponse>>()
        FirestoreConfig.getFirestoreService().collection("legislation")
            .whereArrayContains("category", categoryName)
            .get()
            .addOnCompleteListener(OnCompleteListener<QuerySnapshot?> { task ->
                if (task.isSuccessful) {
                    val legislationList = ArrayList<LegislationResponse>()
                    for (legislation in task.result!!)
                    {
                        // Automap fields to object properties
                        val obj = legislation.toObject<LegislationResponse>()
                        // Inject document id into object
                        obj.id = legislation.id
                        legislationList.add(obj)
                    }
                    // Post value back
                    legislationResult.postValue(legislationList)
                } else {
                    Log.w("Legislation Result", "Error getting documents.", task.exception)
                }

            })
        return legislationResult
    }



    fun getLegislationDocument(legislationId : String) : LiveData<List<String>>{
        val legisDocList = MutableLiveData<List<String>>()
        FirestoreConfig.getFirestoreService().collection("legislation").document(legislationId)
            .get().addOnSuccessListener { doc ->
                if(doc != null){
                    val groupLink = doc["document"] as List<String>?
                    legisDocList.postValue(groupLink)
                }else{
                    Log.e("Legislation Info", "Error getting Pdf documents.")
                }
            }.addOnFailureListener {
                //Failed to access Firestore
            }
        return legisDocList
    }

    fun getLegislationDetail(legislationId : String) : LiveData<LegislationResponse>{
        val legislationResult = MutableLiveData<LegislationResponse>()
        FirestoreConfig.getFirestoreService().collection("legislation").document(legislationId)
            .get()
            .addOnSuccessListener { legislation ->
                val obj = legislation.toObject<LegislationResponse>()
                legislationResult.postValue(obj)
            }
        return legislationResult
    }

    fun getSignedUrl(docId: String): Task<String> {
        val data = hashMapOf(
            "filename" to "${docId}.0.pdf",
            "bucket" to "adil-pdf"
        )

        return functions
            .getHttpsCallable("getSignedUrl")
            .call(data)
            .continueWith { task ->
                val result = task.result?.data as Map<*,*>
                result["url"].toString()
            }
    }

    fun getTimeline(docId: String): Task<List<RelationshipItem?>> {
        val data = hashMapOf(
            "docId" to docId
        )

        return functions
            .getHttpsCallable("getTimeline")
            .call(data)
            .continueWith { task ->
                val results = task.result?.data as List<Object>

                // Cast Map to JSON
                val gson = Gson()
                val json = gson.toJson(results)

                // Type
                val listType = object : TypeToken<List<RelationshipItem?>>() {}.type
                val timeline = gson.fromJson<List<RelationshipItem?>>(json, listType)

                timeline
            }
    }

    fun queryLegislation(query: String): Task<List<QueryHitItem?>> {
        val data = hashMapOf(
            "query" to query
        )

        return functions
            .getHttpsCallable("queryLegislation")
            .call(data)
            .continueWith { task ->
                val resultMap = task.result?.data as Map<String,Any>

                // Cast Map to JSON
                val gson = Gson()
                val json = gson.toJson(resultMap)

                // Extract List of QueryHitItem
                val queryResponse = gson.fromJson(json, QueryResponse::class.java)
                val result = queryResponse.hits.hits
                result
            }
    }
}