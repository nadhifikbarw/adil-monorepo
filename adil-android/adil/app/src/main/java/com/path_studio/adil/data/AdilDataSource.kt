package com.path_studio.adil.data


import androidx.lifecycle.LiveData
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.database.entity.Bookmark
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.data.source.remote.response.RelationshipItem
import kotlinx.coroutines.flow.Flow

interface AdilDataSource {
    fun getAllCategories(): LiveData<List<CategoryResponse>>
    fun getHomeCategories(): LiveData<List<CategoryResponse>>
    fun getLegislationByCategoryName(categoryId: String): LiveData<List<LegislationResponse>>
    fun getLegislationDocument(legislationId : String): LiveData<List<String>>
    fun getBookmarkedLegislation(): Flow<List<Bookmark>>
    suspend fun insertBookmarkedLegislation(bookmark: Bookmark)
    suspend fun deleteLegislatioBookmark(bookmark: Bookmark)
    fun getListBookmarkedLegislation(legislationIds: List<Bookmark>): LiveData<List<LegislationResponse>>
    fun getBookmarkById(legislationId: String): Flow<Bookmark>
    fun getLegislationDetail(legislationId : String) : LiveData<LegislationResponse>
    fun getSignedUrl(docId: String): Task<String>
    fun getTimeline(query: String): Task<List<RelationshipItem?>>
    fun queryLegislation(query: String): Task<List<QueryHitItem?>>
}