package com.path_studio.adil.data.source.remote.response

data class LegislationResponse(

	val peraturanPelaksanaDari: List<RelationshipItem?>? = null,

	val nomorPeraturan: String? = null,

	val mencabut: List<RelationshipItem?>? = null,

	val document: List<String?>? = null,

	val dasarHukumDari: List<RelationshipItem?>? = null,

	val mengubah: List<RelationshipItem?>? = null,

	val source: String? = null,

	val ditafsirkan: List<RelationshipItem?>? = null,

	val tglDiundangkan: String? = null,

	val memilikiDasarHukum: List<RelationshipItem?>? = null,

	val dicabutOleh: List<RelationshipItem?>? = null,

	val tentang: String? = null,

	val diubahOleh: List<RelationshipItem?>? = null,

	val documentStatus: List<Int?>? = null,

	val tglDitetapkan: String? = null,

	val jenisPeraturan: String? = null,

	val dilaksanakanOlehPeraturanPelaksana: List<RelationshipItem?>? = null,

	val daerahId: String? = null,

	val tahunPeraturan: Int? = null,

	val category: List<String?>? = null,

	val menafsirkan: List<RelationshipItem?>? = null,

	val instansi: String? = null

) {
	var id: String = ""
}