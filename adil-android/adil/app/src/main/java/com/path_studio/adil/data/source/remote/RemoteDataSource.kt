package com.path_studio.adil.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.toObject
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

    fun getLegislationByCategory(categoryId: String): LiveData<List<LegislationResponse>>{
        val legislationResult = MutableLiveData<List<LegislationResponse>>()
        FirestoreConfig.getFirestoreService().collection("legislation")
            .whereArrayContains("category", categoryId)
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
                    Log.w("Category Result", "Error getting documents.", task.exception)
                }

            })
        return legislationResult
    }

}