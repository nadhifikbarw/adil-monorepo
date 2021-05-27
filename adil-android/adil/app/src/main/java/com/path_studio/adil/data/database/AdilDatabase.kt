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

    private class AdilDatabaseCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    val bookmarkDao = database.bookmarkDao()
                    bookmarkDao.deleteAllData()
                    val bookmark1 = Bookmark("11e4a1e5a9835d80c031313032303439")
                    bookmarkDao.insertBookmark(bookmark1)
                    val bookmark2 = Bookmark("11e4a2b65ec2e1c29f62313131343438")
                    bookmarkDao.insertBookmark(bookmark2)
                }
            }
        }
    }

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
                    .addCallback(AdilDatabaseCallback(MainScope()))
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}