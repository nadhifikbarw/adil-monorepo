package com.path_studio.adil.di

import android.content.Context
import com.path_studio.adil.AdilApplication
import com.path_studio.adil.data.AdilRepository
import com.path_studio.adil.data.database.AdilDatabase
import com.path_studio.adil.data.source.remote.RemoteDataSource
import kotlinx.coroutines.MainScope

object Injection {
    fun provideImdbRepository(context: Context): AdilRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        val database = (context.applicationContext as AdilApplication).database
        return AdilRepository.getInstance(remoteDataSource, database.bookmarkDao())
    }
}