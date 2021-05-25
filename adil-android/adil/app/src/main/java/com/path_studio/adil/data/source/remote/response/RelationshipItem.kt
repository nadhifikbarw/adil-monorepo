package com.path_studio.adil.data.source.remote.response

data class RelationshipItem(

	val nomorPeraturan: String? = null,

	val tglDiundangkan: String? = null,

	@field:JvmField
	val hasDocument: Boolean? = false,

	val tentang: String? = null,

	val tglDitetapkan: String? = null,

	val jenisPeraturan: String? = null,

	val id: String? = null,

	val tahunPeraturan: Int? = 0,

	val type: String? = null
)
