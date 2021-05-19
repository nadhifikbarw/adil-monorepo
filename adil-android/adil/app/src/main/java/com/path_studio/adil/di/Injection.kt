package com.path_studio.adil.di

import android.content.Context
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.source.remote.RemoteDataSource

object Injection {
    fun provideImdbRepository(context: Context): AdilRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return AdilRepository.getInstance(remoteDataSource)
    }
}