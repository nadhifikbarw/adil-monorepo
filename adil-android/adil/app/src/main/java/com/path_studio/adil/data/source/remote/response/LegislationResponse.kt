package com.path_studio.adil.data.source.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LegislationResponse(
	var legislationId: String,
	var source: String,
	var document: ArrayList<String>,

) : Parcelable

@Parcelize
data class JsonMember11e44c4e41f7c5009036313231323532(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece6fa790aeda313231363438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f71b262808d6a313232313232(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class MemilikiDasarHukumItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a5d77e0e0006a9db313034393237(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f06a93430ba6b313231383232(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e532aa300ab04313231333231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea41e79d0aa5b313231353337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class DitafsirkanItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e52bf31a0a968313231333230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512af4a6709c25313233333432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea7a1fd009b91313231353433(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e3452c4e0bef9313231323239(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e47c6086c2bc46b643313632343334(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e8309da1bbb1de9388303933303231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4fea752670b522313232343434(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4edd6e56b0a96e313231373133(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e714ff8cb6728a16313131363230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f108c0cc0adec313231383339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f0f542ba088d0313231383337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea4015fe0b55c313231353337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class PeraturanPelaksanaDariItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e52e4cb50b272313231333230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f06bd32f08f28313231383232(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e47c5f3773c0788e56313631353132(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45db256ef736e926e303432323037(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class MengubahItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f67a2aef0a3b3313232313035(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e8cdb8ea0b662313231343538(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e5cb4c61a1a84e0303034313339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eb43b6ce089be313231363034(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e291dfe008c87313231323130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e9a030970819a313231353230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e7f676341914b68814303932313539(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e869f6ba0a085313231343437(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e74f65c1bbaabdb303333353137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f0f260ce0a066313231383336(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class MencabutItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a10d2ec42b70bdca303833313131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f02947da0ac5b313231383135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50abdb54409ab5313233303039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e51f785709a31313231333139(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ee4ff56a0a16c313231373236(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4b3575b7a895a857b313530373330(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f1b8fcdf08adf313231383537(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4feb4bbe90bb11313232343436(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e6fb7ecf08bb2313231343039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e55063664fdf98942c313133393135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e531d45c8dc3c4a0e6313431393436(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e899cd9518129923303934363430(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e47c637035b46ca598313634353235(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f880830ca61ab0c4313532353536(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eb6b511c08750313231363038(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e47c59dfcc80c6a4d2313533363537(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e54f9b2adadd46b55b313134353536(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea711b890b890313231353432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eb26bdc80ad4e313231363031(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e712152f0926e313231343131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ffcf56d209c33313232353135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4957506cfa9d0aad9313432343138(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e6fb0f7709284313231343039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e7894e7ee562e69581313133333038(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e8707e6de26b833303534343337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<MenafsirkanItem?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ff1542780ba69313232343536(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e452bd8ae148d089bc313634343335(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ead8d46a0a644313231353533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51ba26f470984b313233373432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51ce8403709b9d313233383136(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e57ac75d457f5a90c9313032303338(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f15067f1093cd313231383436(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f66e86b10a92e313232313034(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e452bdb29a06d087dd313634353432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e52c0bc7083bd313231333230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea427e630ad65313231353337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51d80caee0a476313233383332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e3fc05e908852313231323438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e6b9a40253292a2303232383137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f0fbff7f0a66a313231383337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f87a5553114ca26b313434313432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e84795ee0a385313231343434(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f8534c47ceb6be28313030323137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e81962d20886f313231343339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e7ef72e9dd07ccbea4313131303438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e87635880ae28313231343439(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef94b7e3094ef313231383030(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ead2f7ae0a6e7313231353532(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e89b06b94c7a9abb303935353235(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eccaf32809816313231363435(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c500cba4ca09107313232353432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece541dc09edd313231363438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4fffe487d09ec4313231383131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ec9621600c03f313231363339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e634b27d132bf58303132383438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e8b138ff1dd49e73313233343139(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class DiubahOlehItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e3f6d6350ba17313231323438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f1892a440bcdc313231383532(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ebd430b10a590313231363139(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45da78cb23492a04c303330343532(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e79468864f05589401313433373130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e2bd7a2b0b18f313231323135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a5d802a4ff54a7b7313035333130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f468072f0b0d6313232303039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ed2e9fa4081e4313231363535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e7151232286a32b303330393131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e34b7bea09d4d313231323330(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f1b225d60b12b313231383536(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e535c1b70a21e313231333231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a1e5a9835d80c031313032303439(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e9a83706087ca313231353231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e717f07d08111313231343132(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a859b283b810b5a6313532363332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c511a222c50bb4b313233333134(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f92f5c410896b58a313231373333(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e5d3ef0ac1e95d3303034353330(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f45359700b4f7313232303037(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e49d94360b0e9313231333035(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6b6304cf7cca08904313233353234(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ed6b72cc0b0b0313231373032(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ecfa6f34086b9313231363530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5cb658909a64313231333337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e8cd3e350b690313231343538(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f093f9c9086b9313231383236(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eb60ed2b08fd3313231363037(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e74c398009d4c313231343137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f92e9b430716a48e313231323039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5ddcc080806e313231333339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e789624a0883a313231343234(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e6ef5461556a374303235323138(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e6db77750b307313231343035(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f263fb06089ef313231393135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50be1573a08ca1313233303339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e52caa8b0be41313231333230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f109032f0a38d313231383339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e609120ed98b9e5303130393137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512d39b9d0b619313233333436(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50004139608706313232353231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5c8f9ec0aa07313231333337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ec9045600aa51313231363339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ffae7b030b615313232353132(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f54064c70a8f9313232303332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e6fbe56808064313231343039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4fefb85120972e313232343533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e555142d260eb2a68a313035343434(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e6229515674b020303132303432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<MenafsirkanItem?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a8575ef8ef50b4d4313530393533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef951b2d0a488313231383030(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e8ce530208778313231343538(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e281ce9d0947a313231323039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e67012f109ff3313231333534(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class DicabutOlehItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f4f3d12e08faa313232303234(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e50f424c07e50283d6313432383332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece62d300a225313231363438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6b6302f38ea10c075313233343334(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e8707b2d08348313231343438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6b61da6f7cba08b94313032313535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e7754dc50819e313231343232(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512a463c40b627313233333431(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e97a58c90b192313231353136(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class MenafsirkanItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e52c0f040befc313231333230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e34bd91809c19313231323330(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6b62993037070ad58313134373135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5324b260a410313231333231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e7b2e100ca029cab65303931353130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f93022bb51f2bfea313232333036(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e701081b0acd8313231343039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e549d994087cc313231333233(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512ff04960b67e313233333530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e64705a0550a797303133373030(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class DasarHukumDariItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50fa7172608770313233323231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ebb124b60b246313231363135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef958c210c02c313231383030(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50fd9f4e0081ef313233323236(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f11887390b0e5313231383430(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6b61db0c43d409e53313032323131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eee01f0c08f85313231373431(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e703cdaa09cf9313231343130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45dc0ad62dd0eb0b2303630343435(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5d373d0092f2313231333338(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece67e2d0a19c313231363438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e5048fbf590abb1323331323434(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e89844f64842bbb2303933353431(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece41b650a7dd313231363437(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e532e88e0bdc6313231333231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e61ef16059aa3d0303131393034(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c501b0e6ca0b880313232363036(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e7ed50a9cd188e7d313331313537(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e796c4c9968eb8a97e313434323339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class DilaksanakanOlehPeraturanPelaksanaItem(

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("has_document")
	val hasDocument: Boolean? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ecfb12b10a863313231363530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50abfb6420990c313233303039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f355e2a809340313231393430(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e48c5cf54848d29f0d303033393230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e5997e4e15ea76b23c313232353435(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51b6d54ca08f7c313233373337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f05b93530b790313231383230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef51fa210b578313231373533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e55cf2c63f6efaa37a313131353438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e7044eec0bfc3313231343130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50bf05da808b3e313233303431(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e859b4a609f3e313231343436(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ea421ce60bfd2313231353337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e50dbe1c9848763323331363530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ed09124909b9c313231363531(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512ae04fb0877b313233333432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e816e3100a534313231343339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f137334f0a5f3313231383433(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f002da2c09450313231383131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e433fefc0a048313231323534(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e408f15808f10313231323530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f027fd340980a313231383135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4f9396c8f1ed69b59313332393335(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e56d612c0843e313231333237(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ed2ff9f209274313231363535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6f89acad3140eba51303830333539(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4ee0f7b15c8d6bdaf303833313338(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e40975310ad52313231323530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ece4a57c08741313231363437(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e70774860a923313231343130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e437e6450b70d313231323535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e7d2c83c71deb34c313030323031(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45dc79ab51742803c303635343230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e677678f08f6a313231333535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4c08f225f8658b373313034393331(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef5221bf0938c313231373533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50ad4dd79082cc313233303131(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ebca75a10a836313231363138(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ff21a4940b13f313232343537(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ee0e61110b06e313231373139(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e668af1208be0313231333533(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45da868f90430a6c5303331313032(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f4fbd9930ba75313232303235(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512ab561a0aede313233333432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f262220b08c95313231393135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e719d4eb4ade0aba0e313435333132(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e4960d1f7dec080323232333137(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f0e9849508816313231383335(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51975bed30a930313233363434(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e40afe090bc65313231323530(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e4393394098d8313231323535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e80cb13e0a35e313231343337(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e7f4ece1ae03928f7c313032363239(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45db017911404a68f303430363031(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c51d20e61109c83313233383232(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45e86a97333ee9957303534313538(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e43a73ea0bba1313231323535(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4e89c1934e57aab0f313030333036(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4eedf510378928326303931393233(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4f258813e0b3b5313231393134(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e72986a30aa2d0b06a313431333039(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e2acd8a5093cd313231323133(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c512b2d9780b5f9313233333432(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45dc017057da897f9303630303332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ee763adc0b9ba313231373330(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50fbc95f70a630313233323233(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ef1a942c0aabd313231373437(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ec51f14f0c027313231363332(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e3b13d65091fb313231323431(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e2cadfa30b44b313231323136(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e6f739c78adde8ac54313335373031(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45dc708c7f0de807d303635303135(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4ebd4d827085ec313231363139(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e47c5ec79a5bea99ed313631323034(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<DilaksanakanOlehPeraturanPelaksanaItem?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4eecd25a60b2fa313231373339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4b716f4eee6aea98c303933363335(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50fac7c8c0afa7313233323231(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c50ac6b25b0b0c5313233303130(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e5752d120bbe4313231333238(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<PeraturanPelaksanaDariItem?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e5005af436eb709ad6313531373134(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<MengubahItem?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e9a3e2ec09153313231353230(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e45db1b4232626be01303431373334(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<MencabutItem?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e4a2b65ec2e1c29f62313131343438(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<Any?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e81800740a835313231343339(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<DitafsirkanItem?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<MemilikiDasarHukumItem?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<DicabutOlehItem?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<DiubahOlehItem?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable

@Parcelize
data class JsonMember11e44c4e66965cd0b03b313231333534(

	@field:SerializedName("peraturan_pelaksana_dari")
	val peraturanPelaksanaDari: List<Any?>? = null,

	@field:SerializedName("nomor_peraturan")
	val nomorPeraturan: String? = null,

	@field:SerializedName("mencabut")
	val mencabut: List<Any?>? = null,

	@field:SerializedName("document")
	val document: List<String?>? = null,

	@field:SerializedName("dasar_hukum_dari")
	val dasarHukumDari: List<DasarHukumDariItem?>? = null,

	@field:SerializedName("mengubah")
	val mengubah: List<Any?>? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("ditafsirkan")
	val ditafsirkan: List<Any?>? = null,

	@field:SerializedName("tgl_diundangkan")
	val tglDiundangkan: String? = null,

	@field:SerializedName("memiliki_dasar_hukum")
	val memilikiDasarHukum: List<Any?>? = null,

	@field:SerializedName("dicabut_oleh")
	val dicabutOleh: List<Any?>? = null,

	@field:SerializedName("tentang")
	val tentang: String? = null,

	@field:SerializedName("diubah_oleh")
	val diubahOleh: List<Any?>? = null,

	@field:SerializedName("document_status")
	val documentStatus: List<Int?>? = null,

	@field:SerializedName("tgl_ditetapkan")
	val tglDitetapkan: String? = null,

	@field:SerializedName("jenis_peraturan")
	val jenisPeraturan: String? = null,

	@field:SerializedName("dilaksanakan_oleh_peraturan_pelaksana")
	val dilaksanakanOlehPeraturanPelaksana: List<Any?>? = null,

	@field:SerializedName("daerah_id")
	val daerahId: String? = null,

	@field:SerializedName("tahun_peraturan")
	val tahunPeraturan: Int? = null,

	@field:SerializedName("category")
	val category: List<String?>? = null,

	@field:SerializedName("menafsirkan")
	val menafsirkan: List<Any?>? = null,

	@field:SerializedName("instansi")
	val instansi: String? = null
) : Parcelable
