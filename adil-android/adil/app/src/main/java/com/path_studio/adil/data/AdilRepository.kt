package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import com.path_studio.adil.data.database.dao.BookmarkDao
import com.path_studio.adil.data.database.entity.Bookmark
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.source.remote.RemoteDataSource
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.data.source.remote.response.RelationshipItem
import kotlinx.coroutines.flow.Flow


class AdilRepository(private val remoteDataSource: RemoteDataSource,
                     private val bookmarkDao: BookmarkDao): AdilDataSource {

    companion object {
        @Volatile
        private var instance: AdilRepository? = null

        fun getInstance(remoteData: RemoteDataSource,
                        bookmarkDao: BookmarkDao): AdilRepository =
            instance ?: synchronized(this) {
                instance ?: AdilRepository(remoteData, bookmarkDao).apply {
                    instance = this
                }
            }
    }

    override fun getAllCategories(): LiveData<List<CategoryResponse>>{
        return remoteDataSource.getCategories()
    }

    override fun getHomeCategories(): LiveData<List<CategoryResponse>>{
        return remoteDataSource.getHomeCategories()
    }

    override fun getLegislationByCategoryName(categoryId: String): LiveData<List<LegislationResponse>>{
        return remoteDataSource.getLegislationByCategory(categoryId)
    }

    override fun getLegislationDocument(legislationId: String): LiveData<List<String>> {
        return remoteDataSource.getLegislationDocument(legislationId)
    }

    override fun getBookmarkedLegislation(): Flow<List<Bookmark>> {
        return bookmarkDao.getAllBookmarks()
    }

    override suspend fun insertBookmarkedLegislation(bookmark: Bookmark) {
        bookmarkDao.insertBookmark(bookmark)
    }

    override suspend fun deleteLegislatioBookmark(bookmark: Bookmark) {
        bookmarkDao.deleteBookmark(bookmark)
    }

    override fun getListBookmarkedLegislation(legislationIds: List<Bookmark>): LiveData<List<LegislationResponse>> {
        return remoteDataSource.getBookmarkedLegislations(legislationIds)
    }

    override fun getBookmarkById(legislationId: String): Flow<Bookmark> {
        return bookmarkDao.getBookmarkById(legislationId)
    }

    override fun getLegislationDetail(legislationId: String): LiveData<LegislationResponse> {
        return remoteDataSource.getLegislationDetail(legislationId)
    }

    override fun getSignedUrl(docId: String): Task<String> {
        return remoteDataSource.getSignedUrl(docId)
    }

    override fun getTimeline(docId: String): Task<List<RelationshipItem?>> {
        return remoteDataSource.getTimeline(docId)
    }

    override fun queryLegislation(query: String): Task<List<QueryHitItem?>> {
        return remoteDataSource.queryLegislation(query)
    }


}