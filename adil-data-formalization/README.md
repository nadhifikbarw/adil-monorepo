# Data Model

Bentuk data model ini masih kasar, dan masih mungkin terjadi perubahan seiring berjalannya proyek

## Contoh Data Satu Dokumen Legislasi
```json
{
  "_id": "11e44c4ed09124909b9c313231363531",
  "source": "https://peraturan.go.id/peraturan/view.html?id=11e44c4ed09124909b9c313231363531",
  "document": [
    "https://peraturan.go.id/common/dokumen/ln/2014/ps23-2014.pdf"
  ],
  "document_status": [
    200
  ],
  "jenis_peraturan": "Peraturan Presiden",
  "nomor_peraturan": "23",
  "tahun_peraturan": 2014,
  "tentang": "PENDIRIAN UNIVERSITAS TIDAR",
  "tgl_ditetapkan": "2014-04-01",
  "tgl_diundangkan": "2014-04-01",
  "category": [
    "HAM",
    "Pendidikan & Kebudayaan"
  ],
  "memiliki_dasar_hukum": [
    {
      "id": "11e44c4ebd49cfc093ae313231363139",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    },
    {
      "id": "11e44c4e8d85a200b146313231343539",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    },
    {
      "id": "11e44c4ea9755c808dde313231353436",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    },
    {
      "id": "11e44c4e42dc10c0b144313231323534",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    }
  ],
  "dasar_hukum_dari": [
    {
      "id": "11e6d7078d8710f0b89c313433363532",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    }
  ],
  "mencabut": [],
  "dilaksanakan_oleh_peraturan_pelaksana": [],
  "ditafsirkan": [],
  "instansi": "",
  "diubah_oleh": [],
  "dicabut_oleh": [],
  "mengubah": [],
  "menafsirkan": [],
  "peraturan_pelaksana_dari": [],
  "daerah_id": ""
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
  "memiliki_dasar_hukum":[
    {
      "id": "11e6d7078d8710f0b89c313433363532",
      "jenis_peraturan": "",
      "nomor_peraturan": "",
      "tahun_peraturan": 0,
      "tgl_ditetapkan": "",
      "tgl_diundangkan": "",
      "tentang": "",
      "has_document": false
    }
  ]
}
```