package com.path_studio.adil.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class LegislationResponse(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<RelationshipItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<RelationshipItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<RelationshipItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<RelationshipItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<RelationshipItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<RelationshipItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<RelationshipItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<RelationshipItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<RelationshipItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<RelationshipItem?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
)