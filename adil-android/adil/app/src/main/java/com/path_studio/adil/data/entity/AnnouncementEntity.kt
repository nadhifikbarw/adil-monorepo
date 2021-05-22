package com.path_studio.adil.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnnouncementEntity(
    var id: Int,
    var title: String,
    var detail: String,
    var status: String
): Parcelable
