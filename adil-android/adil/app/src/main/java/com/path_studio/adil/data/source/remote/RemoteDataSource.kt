package com.path_studio.adil.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.toObject
import com.path_studio.adil.data.database.entity.Bookmark
import com.path_studio.adil.data.source.remote.firestore.FirestoreConfig
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse

class RemoteDataSource {

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
                    legisDocList.postValue(groupLink!!)
                }else{
                    Log.e("Legislation Info", "Error getting Pdf documents.")
                }
            }.addOnFailureListener {
                //Failed to access Firestore
            }
        return legisDocList
    }

    fun getBookmarkedLegislations(legislationIds: List<Bookmark>) : LiveData<List<LegislationResponse>> {
        val legisDocResponse = MutableLiveData<List<LegislationResponse>>()
        val bookmarkedList = ArrayList<LegislationResponse>()
        for(bookmark in legislationIds) {
            FirestoreConfig.getFirestoreService().collection("legislation")
                .document(bookmark.legislationId)
                .get()
                .addOnCompleteListener { task ->
                    if(task.isSuccessful) {
                        val result = task.result
                        if(result != null) {
                            val obj = result.toObject<LegislationResponse>()
                            if (obj != null) {
                                obj.id = result.id
                                bookmarkedList.add(obj)
                            }
                        }
                        legisDocResponse.postValue(bookmarkedList)
                    } else {
                        Log.e("Legislation Firebase Error", "Failed to fetch the data")
                    }
                }
        }
        return legisDocResponse
    }

}