package com.path_studio.adil.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.toObjects
import com.path_studio.adil.data.source.remote.firestore.FirestoreConfig
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.data.source.remote.response.RelationshipItem


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
                    val categoryList = task.getResult()?.toObjects<CategoryResponse>()
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
            .whereEqualTo("is_front_category", true)
            .get()
            .addOnCompleteListener(OnCompleteListener<QuerySnapshot?> { task ->
                if (task.isSuccessful) {
                    val categoryList = task.getResult()?.toObjects<CategoryResponse>()
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
                    val legislationList = task.getResult()?.toObjects<LegislationResponse>()
                    legislationResult.postValue(legislationList)
                } else {
                    Log.w("Category Result", "Error getting documents.", task.exception)
                }

            })
        return legislationResult
    }

}