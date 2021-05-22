package com.path_studio.adil.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class CategoryResponse(

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("icon")
    val icon: String? = null,

    @field:JvmField
    val isFrontCategory: Boolean? = null,

    @field:SerializedName("name")
    val name: String? = null,
) {
    var id: String = ""
}
