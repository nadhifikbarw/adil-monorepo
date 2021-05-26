package com.path_studio.adil.ui.pdfView

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.AdilRepository

class PdfViewerViewModel(private val adilRepository: AdilRepository) : ViewModel(){

    private lateinit var legislationId: String

    fun selectedLegislation(legislationId: String) {
        this.legislationId = legislationId
    }

    fun getSignedUrl(docId: String): Task<String> = adilRepository.getSignedUrl(legislationId)
}