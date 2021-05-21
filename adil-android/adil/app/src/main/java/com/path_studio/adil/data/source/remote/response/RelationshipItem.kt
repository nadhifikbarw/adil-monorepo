package com.path_studio.adil.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class RelationshipItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = false,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = 0
)
