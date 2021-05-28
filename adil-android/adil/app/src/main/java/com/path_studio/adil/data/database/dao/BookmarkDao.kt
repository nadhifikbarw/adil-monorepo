package com.path_studio.adil.data.database.dao

import androidx.room.*
import com.path_studio.adil.data.database.entity.Bookmark
import kotlinx.coroutines.flow.Flow

@Dao
interface BookmarkDao {

    @Query("Select * from bookmark")
    fun getAllBookmarks(): Flow<List<Bookmark>>

    @Query("Select * from bookmark where legislation_id=:legislationId")
    fun getBookmarkById(legislationId: String): Flow<Bookmark>

    @Delete
    suspend fun deleteBookmark(bookmark: Bookmark)

    @Query("DELETE FROM bookmark")
    fun deleteAllData()

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertBookmark(bookmark: Bookmark)


}