package com.path_studio.adil.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
data class QueryHitItem(

	@field:SerializedName("_index")
	val index: String? = null,

	@field:SerializedName("_type")
	val type: String? = null,

	@field:SerializedName("_source")
	val source: Source? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("_score")
	val score: Double? = null
) : Parcelable

@Parcelize
data class Source(

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("daerahId")
	val daerahId: String? = null,

	@field:SerializedName("tahunPeraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("nomorPeraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tglDitetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("tglDiundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("jenisPeraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable
