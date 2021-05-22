package com.path_studio.adil.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimeLineEntity (
    var id: Int = 0,
    var year: Int = 0,
    var title: String = "",
    var detail: String = ""
): Parcelable