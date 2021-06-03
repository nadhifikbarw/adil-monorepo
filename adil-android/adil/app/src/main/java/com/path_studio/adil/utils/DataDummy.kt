package com.path_studio.adil.utils

import com.path_studio.adil.data.entity.AnnouncementEntity
import com.path_studio.adil.data.entity.CategoryEntity
import com.path_studio.adil.data.entity.TimeLineEntity

object DataDummy {

    fun getAllCategories(): ArrayList<CategoryEntity> {
        return arrayListOf(
            CategoryEntity(
                1,
                "Industri",
                "ic_keuangan"
            ),
            CategoryEntity(
                2,
                "Keuangan",
                "ic_keuangan"
            ),
            CategoryEntity(
                3,
                "Pertahanan",
                "ic_pertahanan"
            ), CategoryEntity(
                4,
                "Kelautan",
                "ic_kelautan"
            ),
            CategoryEntity(
                5,
                "Kesehatan",
                "ic_kesehatan"
            ),
            CategoryEntity(
                6,
                "Pekerjaan",
                "ic_pekerjaan"
            ),
            CategoryEntity(
                7,
                "Pendidikan",
                "ic_pendidikan"
            ),
            CategoryEntity(
                8,
                "Perbankan",
                "ic_perbankan"
            )
        )
    }

    fun getAllAnnouncement(): ArrayList<AnnouncementEntity> {
        return arrayListOf(
            AnnouncementEntity(
                1,
                "Surat Edaran Menteri Investasi/Kepala Badan Koordinasi Penanaman Modal Nomor 14 Tahun 2021",
                "PERALIHAN PENYELENGGARAAN PERIZINAN BERUSAHA MENJADI PENYELENGGARAAN PERIZINAN BERUSAHA BERBASIS RISIKO MELALUI SISTEM OSS",
                "Disahkan"
            ),
            AnnouncementEntity(
                2,
                "Peraturan Menteri Perdagangan Nomor 34 Tahun 2021",
                "PENETAPAN HARGA PATOKAN EKSPOR ATAS PRODUK PERTANIAN DAN KEHUTANAN YANG DIKENAKAN BEA KELUAR",
                "Disahkan"
            ),
            AnnouncementEntity(
                3,
                "Instruksi Menteri Dalam Negeri Nomor 12 Tahun 2021",
                "PERPANJANGAN PEMBERLAKUAN PEMBATASAN KEGIATAN MASYARAKAT BERBASIS MIKRO DAN MENGOPTIMALKAN POSKO PENANGANAN CORONA VIRUS DISEASE 2019 DI TINGKAT DESA DAN KELURAHAN UNTUK PENGENDALIAN PENYEBARAN CORONA VIRUS DISEASE 2019",
                "Disahkan"
            ),
            AnnouncementEntity(
                4,
                "Surat Edaran Direksi KSEI Nomor KSEI-4012/DIR/0521 Tahun 2021",
                "PENERAPAN MODUL E-PROXY DAN MODUL E-VOTING PADA APLIKASI eASY.KSEI BESERTA TAYANGAN RAPAT UMUM PEMEGANG SAHAM",
                "Disahkan"
            ),
            AnnouncementEntity(
                5,
                "Surat Edaran Direktur Jenderal Pajak Nomor SE-35/PJ/2021 Tahun 2021",
                "PETUNJUK PELAKSANAAN PENELITIAN SURAT KETERANGAN DOMISILI WAJIB PAJAK LUAR NEGERI PADA PROSES PEMERIKSAAN, KEBERATAN, DAN PENGURANGAN ATAU PEMBATALAN SURAT KETETAPAN PAJAK",
                "Disahkan"
            ),
            AnnouncementEntity(
                6,
                "Keputusan Gubernur DKI Jakarta Nomor 671 Tahun 2021",
                "PERPANJANGAN PEMBERLAKUAN PEMBATASAN KEGIATAN MASYARAKAT BERBASIS MIKRO",
                "Disahkan"
            )
        )
    }

    fun getTimeline(): ArrayList<TimeLineEntity> {
        return arrayListOf(
            TimeLineEntity(
                1,
                2021,
                "Perubahan UU No. 100 Tahun 2007",
                "Ini adalah detail perubahan UU No.100 tahun 2007 tentang Apa Aja Boleh."
            ),
            TimeLineEntity(
                2,
                2018,
                "Perubahan UU No. 100 Tahun 2007",
                "Ini adalah detail perubahan UU No.100 tahun 2007 tentang Apa Aja Boleh."
            ),
            TimeLineEntity(
                3,
                2013,
                "Perubahan UU No. 100 Tahun 2007",
                "Ini adalah detail perubahan UU No.100 tahun 2007 tentang Apa Aja Boleh."
            ),
            TimeLineEntity(
                4,
                2007,
                "Pembentukan UU No. 100 Tahun 2007",
                "Ini adalah detail pembentukan UU No.100 tahun 2007 tentang Apa Aja Boleh."
            )
        )
    }
}