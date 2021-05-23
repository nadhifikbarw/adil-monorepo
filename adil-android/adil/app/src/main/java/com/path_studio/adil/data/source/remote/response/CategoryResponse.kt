package com.path_studio.adil.data.source.remote.response

data class CategoryResponse(

    val count: Int? = null,

    val icon: String? = null,

    @field:JvmField
    val isFrontCategory: Boolean? = null,

    val name: String? = null

) {
    var id: String = ""
}
