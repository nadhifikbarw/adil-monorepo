package com.path_studio.adil.ui.detailUU.timeline

import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.RelationshipItem

class TimelineViewModel(private val adilRepository: AdilRepository) : ViewModel() {
    fun getTimeline(docId: String): Task<List<RelationshipItem?>> = adilRepository.getTimeline(docId)
}