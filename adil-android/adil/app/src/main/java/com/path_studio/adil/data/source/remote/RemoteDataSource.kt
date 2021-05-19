package com.path_studio.adil.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.QuerySnapshot
import com.path_studio.adil.data.source.remote.firestore.FirestoreConfig
import com.path_studio.adil.data.source.remote.response.CategoryResponse


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
                    for (document in task.result!!) {
                        val category = CategoryResponse(
                            document.id,
                            document.data["count"].toString().toInt(),
                            document.data["name"].toString()
                            )
                        categoryList.add(category)
                    }
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
            .orderBy("count")
            .get()
            .addOnCompleteListener(OnCompleteListener<QuerySnapshot?> { task ->
                if (task.isSuccessful) {
                    val categoryList = ArrayList<CategoryResponse>()
                    for (document in task.result!!) {
                        val category = CategoryResponse(
                            document.id,
                            document.data["count"].toString().toInt(),
                            document.data["name"].toString()
                        )
                        categoryList.add(category)
                    }
                    categoryResult.postValue(categoryList)
                } else {
                    Log.w("Category Result", "Error getting documents.", task.exception)
                }

            })
        return categoryResult
    }

}