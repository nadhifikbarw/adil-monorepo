package com.path_studio.adil.ui.detailUU.information

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.database.entity.Bookmark
import kotlinx.coroutines.launch

class InformationViewModel(private val repository: AdilRepository): ViewModel() {
    fun getBookmarkById(legislationId: String): LiveData<Bookmark> {
        return repository.getBookmarkById(legislationId).asLiveData()
    }

    fun insertBookmark(bookmark: Bookmark) = viewModelScope.launch {
        repository.insertBookmarkedLegislation(bookmark)
    }

    fun deleteBookmark(bookmark: Bookmark) = viewModelScope.launch {
        repository.deleteLegislatioBookmark(bookmark)
    }

}