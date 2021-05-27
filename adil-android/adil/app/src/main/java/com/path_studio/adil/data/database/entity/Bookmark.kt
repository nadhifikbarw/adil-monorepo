package com.path_studio.adil.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookmark")
data class Bookmark(
    @PrimaryKey
    @ColumnInfo(name = "legislation_id")
    val legislationId: String
)
