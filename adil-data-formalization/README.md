# Data Model

Current data model uses camelCase casing standard for its field to provide support for GSON parsing used by Android app.

Full dataset can be found at `data_fixed_firestore_camel.json`

## Legislation Firestore Doc Example
```json
{
    "source": "https://peraturan.go.id/peraturan/view.html?id=11e44c4ed09124909b9c313231363531",
    "document": [
      "https://peraturan.go.id/common/dokumen/ln/2014/ps23-2014.pdf"
    ],
    "documentStatus": [
      200
    ],
    "jenisPeraturan": "Peraturan Presiden",
    "tentang": "PENDIRIAN UNIVERSITAS TIDAR",
    "tglDitetapkan": "2014-04-01",
    "tglDiundangkan": "2014-04-01",
    "memilikiDasarHukum": [
      {
        "id": "11e44c4ebd49cfc093ae313231363139",
        "jenisPeraturan": "",
        "nomorPeraturan": "",
        "tahunPeraturan": 0,
        "tglDitetapkan": "",
        "tglDiundangkan": "",
        "tentang": "",
        "hasdocument": false
      },
      {
        "id": "11e44c4e8d85a200b146313231343539",
        "jenisPeraturan": "",
        "nomorPeraturan": "",
        "tahunPeraturan": 0,
        "tglDitetapkan": "",
        "tglDiundangkan": "",
        "tentang": "",
        "hasdocument": false
      },
      {
        "id": "11e44c4ea9755c808dde313231353436",
        "jenisPeraturan": "",
        "nomorPeraturan": "",
        "tahunPeraturan": 0,
        "tglDitetapkan": "",
        "tglDiundangkan": "",
        "tentang": "",
        "hasdocument": false
      },
      {
        "id": "11e44c4e42dc10c0b144313231323534",
        "jenisPeraturan": "",
        "nomorPeraturan": "",
        "tahunPeraturan": 0,
        "tglDitetapkan": "",
        "tglDiundangkan": "",
        "tentang": "",
        "hasdocument": false
      }
    ],
    "dasarHukumDari": [
      {
        "id": "11e6d7078d8710f0b89c313433363532",
        "jenisPeraturan": "",
        "nomorPeraturan": "",
        "tahunPeraturan": 0,
        "tglDitetapkan": "",
        "tglDiundangkan": "",
        "tentang": "",
        "hasdocument": false
      }
    ],
    "mencabut": [],
    "dilaksanakanOlehPeraturanPelaksana": [],
    "ditafsarkan": [],
    "instansi": "",
    "diubahOleh": [],
    "dicabutOleh": [],
    "mengubah": [],
    "menafsirkan": [],
    "peraturanPelaksanaDari": [],
    "daerahId": ""
  }
```

## Relationship Fields

These fields contain collection object RelationshipItem objects

1. "dasarHukumDari"
2. "mencabut"
3. "dilaksanakanOlehPeraturanPelaksana"
4. "ditafsarkan"
5. "diubahOleh"
6. "dicabutOleh"
7. "mengubah"
8. "menafsirkan"
9. "peraturanPelaksanaDari"
10. "memilikiDasarHukum"


Below are example of "mengubah" field which shows one RelationshipItem object:

```json
{
  "memiliki_dasar_hukum":[
    {
      "id": "11e44c4ebd49cfc093ae313231363139",
      "jenisPeraturan": "",
      "nomorPeraturan": "",
      "tahunPeraturan": 0,
      "tglDitetapkan": "",
      "tglDiundangkan": "",
      "tentang": "",
      "hasdocument": false
    }
  ]
}
```