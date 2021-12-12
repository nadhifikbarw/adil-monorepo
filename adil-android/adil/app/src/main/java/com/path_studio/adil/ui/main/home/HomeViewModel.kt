package com.path_studio.adil.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse

class HomeViewModel(private val adilRepository: AdilRepository): ViewModel() {
    fun getHomeCategories(): LiveData<List<CategoryResponse>> = adilRepository.getHomeCategories()
    fun getLegislationDetail(legislationId: String): LiveData<LegislationResponse> = adilRepository.getLegislationDetail(legislationId)
    fun getLatestUpdates(limit: Int):LiveData<List<LegislationResponse>> = adilRepository.getLatestUpdates(limit)
}