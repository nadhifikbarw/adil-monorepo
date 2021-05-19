package com.path_studio.adil.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.CategoryResponse

class HomeViewModel(private val adilRepository: AdilRepository): ViewModel() {
    fun getAllCategories(): LiveData<List<CategoryResponse>> = adilRepository.getAllCategories()
}