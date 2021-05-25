package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse

interface AdilDataSource {
    fun getAllCategories(): LiveData<List<CategoryResponse>>
    fun getHomeCategories(): LiveData<List<CategoryResponse>>
    fun getLegislationByCategoryName(categoryId: String): LiveData<List<LegislationResponse>>
    fun getLegislationDocument(legislationId : String): LiveData<List<String>>
    fun getLegislationDetail(legislationId : String) : LiveData<LegislationResponse>
}