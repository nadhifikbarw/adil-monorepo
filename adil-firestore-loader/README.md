# Data Model

Bentuk data model ini masih kasar, dan masih mungkin terada perubahan seiring berjalannya proyek

## Contoh Data Satu Dokumen Legislasi
```json
{
  "11e531d45c8dc3c4a0e6313431393436":{
    "source":"https://peraturan.go.id/peraturan/view.html?id=11e531d45c8dc3c4a0e6313431393436",
    "document":["https://peraturan.go.id/common/dokumen/bn/2014/bn747-2014.pdf"],
    "document_status":[200],
    "jenis_peraturan":"Peraturan Lembaga Pemerintah Non Kementerian",
    "nomor_peraturan":"27",
    "tahun_peraturan":2014,
    "tentang":"PERUBAHAN ATAS PERATURAN KOMISI PEMILIHAN UMUM NOMOR 16 TAHUN 2014 TENTANG KAMPANYE PEMILIHAN UMUM PRESIDEN DAN WAKIL PRESIDEN",
    "tgl_ditetapkan":"2014-06-05",
    "tgl_diundangkan":"2014-06-06",
    "category":["Uncategorized"],
    "instansi":"Komisi Pemilihan Umum",
    "daerah_id":"",
    "memiliki_dasar_hukum":[
      {
        "id":"11e44c4f137334f0a5f3313231383433",
        "jenis_peraturan":"Undang-Undang",
        "nomor_peraturan":"42",
        "tahun_peraturan":2008
      },
      {
        "id":"11e44c4ea427e630ad65313231353337",
        "jenis_peraturan":"Undang-Undang",
        "nomor_peraturan":"15",
        "tahun_peraturan":2011
      },
      {
        "id":"11e5002daded459c9a6f303935333039",
        "jenis_peraturan":"None",
        "nomor_peraturan":"None",
        "tahun_peraturan":"None"
      },
      {
        "id":"11e5002e192e856e908f303935363039",
        "jenis_peraturan":"None",
        "nomor_peraturan":"None",
        "tahun_peraturan":"None"
      },
      {
        "id":"11e44c50a918dbe0c03d313233303034",
        "jenis_peraturan":"None",
        "nomor_peraturan":"None",
        "tahun_peraturan":"None"
      },
      {
        "id":"11e44c50abdb54409ab5313233303039",
        "jenis_peraturan":"Peraturan Lembaga Pemerintah Non Kementerian",
        "nomor_peraturan":"15",
        "tahun_peraturan":2014
      }
    ],
    "dasar_hukum_dari":[],
    "mencabut":[],
    "dilaksanakan_oleh_peraturan_pelaksana":[],
    "ditafsirkan":[],
    "diubah_oleh":[],
    "dicabut_oleh":[],
    "mengubah":[
      {
        "id":"11e44c50abfb6420990c313233303039",
        "jenis_peraturan":"Peraturan Lembaga Pemerintah Non Kementerian",
        "nomor_peraturan":"16",
        "tahun_peraturan":2014
      }
    ],
    "menafsirkan":[],
    "peraturan_pelaksana_dari":[]
  }
}
```

## Keterangan Field Relationship

Untuk key berikut adalah Field yang menyimpan RELATIONSHIP dengan dokumen lain
1. "dasar_hukum_dari"
2. "dicabut_oleh"
3. "dilaksanakan_oleh_peraturan_pelaksana"
4. "ditafsikan"
5. "memiliki_dasar_hukum"
6. "menafsirkan"
7. "mencabut"
8. "mengubah"
9. "peraturan_pelaksana_dari"

Field relationship memiliki bentuk value Array of Object (NodeJS) / HashMap (Java) /Dictionary (Python).

Lihat contohnya pada field "mengubah" dibawah ini:

```json
{
  "mengubah":[
    {
      "id":"11e44c50abfb6420990c313233303039",
      "jenis_peraturan":"Peraturan Lembaga Pemerintah Non Kementerian",
      "nomor_peraturan":"16",
      "tahun_peraturan":2014
    }
  ]
}
```