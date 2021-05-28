package com.path_studio.adil.ui.searchResult

import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.response.QueryHitItem

class SearchResultViewModel(private val adilRepository: AdilRepository) : ViewModel(){

    fun queryLegislation(query :String) : Task<List<QueryHitItem>> = adilRepository.queryLegislation(query)

}