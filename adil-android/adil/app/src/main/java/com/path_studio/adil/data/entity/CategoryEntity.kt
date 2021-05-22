package com.path_studio.adil.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CategoryEntity (
    var id: Int,
    var name: String,
    var icon: String
): Parcelable