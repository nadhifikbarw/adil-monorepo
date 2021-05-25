package com.path_studio.adil.ui.detailUU.information

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.LegislationResponse

class InformationViewModel(private val adilRepository: AdilRepository) : ViewModel() {

    private lateinit var legislationId: String

    fun selectedLegislation(legislationId: String) {
        this.legislationId = legislationId
    }

    fun getLegislationDetail(): LiveData<LegislationResponse> = adilRepository.getLegislationDetail(legislationId)

}