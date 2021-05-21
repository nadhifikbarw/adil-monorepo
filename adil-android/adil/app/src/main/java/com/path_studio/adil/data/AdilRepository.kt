package com.path_studio.adil.data

import androidx.lifecycle.LiveData
import com.path_studio.adil.data.source.remote.RemoteDataSource
import com.path_studio.adil.data.source.remote.response.CategoryResponse

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

    override fun getLegislationByCategoryId(categoryId: String): LiveData<List<LegislationResponse>>{
        return remoteDataSource.getLegislationByCategory(categoryId)
    }
}