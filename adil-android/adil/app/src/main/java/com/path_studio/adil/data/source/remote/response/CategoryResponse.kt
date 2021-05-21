package com.path_studio.adil.data.source.remote.response

data class CategoryResponse(
    var id: String,
    var count: Int,
    var icon: String,
    var is_front_category: Boolean,
    var name: String,
)
