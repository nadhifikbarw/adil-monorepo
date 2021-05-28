package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import com.google.android.gms.tasks.Task
import com.path_studio.adil.data.source.remote.RemoteDataSource
import com.path_studio.adil.data.source.remote.response.CategoryResponse
import com.path_studio.adil.data.source.remote.response.LegislationResponse
import com.path_studio.adil.data.source.remote.response.QueryHitItem
import com.path_studio.adil.data.source.remote.response.RelationshipItem

class AdilRepository(private val remoteDataSource: RemoteDataSource): AdilDataSource {

    companion object {
        @Volatile
        private var instance: AdilRepository? = null

        fun getInstance(remoteData: RemoteDataSource): AdilRepository =
            instance ?: synchronized(this) {
                instance ?: AdilRepository(remoteData).apply {
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

    override fun getLegislationByCategoryName(categoryName: String): LiveData<List<LegislationResponse>>{
        return remoteDataSource.getLegislationByCategory(categoryName)
    }

    override fun getLegislationDocument(legislationId: String): LiveData<List<String>> {
        return remoteDataSource.getLegislationDocument(legislationId)
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