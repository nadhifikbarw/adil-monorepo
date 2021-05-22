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
                "PP Tahun 2020 Telah Dicabut",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral.",
                "Dicabut"
            ),
            AnnouncementEntity(
                2,
                "UU No. 13 Tahun 2003 tentang Ketenagakerjaan Telah Disahkan",
                "Hukum ketenagakerjaan mengatur tentang segala hal yang berhubungan dengan tenaga kerja pada waktu sebelum, " +
                        "selama, dan sesudah kerja.",
                "Disahkan"
            ),
            AnnouncementEntity(
                1,
                "PP Tahun 2020 Telah Dicabut",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral.",
                "Dicabut"
            ),
            AnnouncementEntity(
                2,
                "UU No. 13 Tahun 2003 tentang Ketenagakerjaan Telah Disahkan",
                "Hukum ketenagakerjaan mengatur tentang segala hal yang berhubungan dengan tenaga kerja pada waktu sebelum, " +
                        "selama, dan sesudah kerja.",
                "Disahkan"
            ),
            AnnouncementEntity(
                1,
                "PP Tahun 2020 Telah Dicabut",
                "Pelaksanaan undang-undang tentang cipta kerja sektor energi dan sumber daya mineral.",
                "Dicabut"
            ),
            AnnouncementEntity(
                2,
                "UU No. 13 Tahun 2003 tentang Ketenagakerjaan Telah Disahkan",
                "Hukum ketenagakerjaan mengatur tentang segala hal yang berhubungan dengan tenaga kerja pada waktu sebelum, " +
                        "selama, dan sesudah kerja.",
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