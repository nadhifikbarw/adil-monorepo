package com.path_studio.adil.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BannerEntity (
    var bannerId:Int,
    var bannerTitle: String,
    var bannerDetails: String
):Parcelable