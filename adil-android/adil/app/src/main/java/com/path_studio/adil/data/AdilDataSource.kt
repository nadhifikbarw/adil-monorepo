package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.google.firebase.firestore.QueryDocumentSnapshot
import com.path_studio.adil.data.entity.CategoryEntity
import com.path_studio.adil.data.source.remote.response.CategoryResponse

interface AdilDataSource {
    fun getAllCategories(): LiveData<List<CategoryResponse>>
}