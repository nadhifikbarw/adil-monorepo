package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import com.path_studio.adil.data.source.remote.response.CategoryResponse

interface AdilDataSource {
    fun getAllCategories(): LiveData<List<CategoryResponse>>
    fun getHomeCategories(): LiveData<List<CategoryResponse>>
    fun getLegislationByCategoryId(categoryId: String): LiveData<List<LegislationResponse>>
}