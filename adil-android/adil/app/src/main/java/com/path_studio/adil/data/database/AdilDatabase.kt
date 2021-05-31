package com.path_studio.adil.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.path_studio.adil.data.database.dao.BookmarkDao
import com.path_studio.adil.data.database.entity.Bookmark
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@Database(entities = [Bookmark::class], version = 1, exportSchema = false)
abstract class AdilDatabase : RoomDatabase() {

    abstract fun bookmarkDao(): BookmarkDao

    companion object {
        @Volatile
        private var INSTANCE: AdilDatabase? = null

        fun getDatabase(context: Context): AdilDatabase {
            return INSTANCE?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AdilDatabase::class.java,
                    "adil_database"
                )
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}