package com.path_studio.adil.ui.categoryResult

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.LegislationResponse

class CategoryResultViewModel (private val adilRepository: AdilRepository): ViewModel() {
    fun getLegislationResult(categoryName: String): LiveData<List<LegislationResponse>> =
        adilRepository.getLegislationByCategoryName(categoryName)

    fun getLegislationResultByYear(year: Int):LiveData<List<LegislationResponse>> =
        adilRepository.getLegislationResultByYear(year)
}