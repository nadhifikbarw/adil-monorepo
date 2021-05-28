package com.path_studio.adil.ui.main.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.database.entity.Bookmark
import com.path_studio.adil.data.source.remote.response.LegislationResponse

class BookmarkViewModel(private val repository: AdilRepository): ViewModel() {

    val allBookmarks: LiveData<List<Bookmark>> = repository.getBookmarkedLegislation().asLiveData()

    fun getBookmarkedLegislation(legislationIds: List<Bookmark>):  LiveData<List<LegislationResponse>> {
        return repository.getListBookmarkedLegislation(legislationIds)
    }
}