import json

if __name__ == '__main__':
    with open('../data_fixed_firestore.json', 'r') as fd:
        data: dict = json.load(fd)

    data_fixed = dict()
    for docId, doc in data.items():
        # Fields map
        fieldMap = {
            "source": "source",
            "document": "document",
            "document_status": "documentStatus",
            "jenis_peraturan": "jenisPeraturan",
            "tentang": "tentang",
            "tgl_ditetapkan": "tglDitetapkan",
            "tgl_diundangkan": "tglDiundangkan",
            "memiliki_dasar_hukum": "memilikiDasarHukum",
            "dasar_hukum_dari": "dasarHukumDari",
            "mencabut": "mencabut",
            "dilaksanakan_oleh_peraturan_pelaksana": "dilaksanakanOlehPeraturanPelaksana",
            "ditafsirkan": "ditafsarkan",
            "instansi": "instansi",
            "diubah_oleh": "diubahOleh",
            "dicabut_oleh": "dicabutOleh",
            "mengubah": "mengubah",
            "menafsirkan": "menafsirkan",
            "peraturan_pelaksana_dari": "peraturanPelaksanaDari",
            "daerah_id": "daerahId",

        }
        newDoc = dict()

        # Rename fieldKey
        for old, new in fieldMap.items():
            newDoc[new] = doc[old]

        # Rename relationships
        fieldMapRelItem = {
            "id": "id",
            "jenis_peraturan": "jenisPeraturan",
            "nomor_peraturan": "nomorPeraturan",
            "tahun_peraturan": "tahunPeraturan",
            "tgl_ditetapkan": "tglDitetapkan",
            "tgl_diundangkan": "tglDiundangkan",
            "tentang": "tentang",
            "has_document": "hasdocument",
        }

        relationships = [
            "dasarHukumDari",
            "mencabut",
            "dilaksanakanOlehPeraturanPelaksana",
            "ditafsarkan",
            "diubahOleh",
            "dicabutOleh",
            "mengubah",
            "menafsirkan",
            "peraturanPelaksanaDari",
            "memilikiDasarHukum"
        ]

        for field in relationships:
            newVal = []
            for doc in newDoc[field]:
                newRelItem = dict()
                for old, new in fieldMapRelItem.items():
                    newRelItem[new] = doc[old]
                newVal.append(newRelItem)
            newDoc[field] = newVal


        # add to docs
        data_fixed[docId] = newDoc

    # JSON Dumps
    with open('../data_fixed_firestore_camel.json', 'w', encoding='utf-8') as fd:
        json.dump(data_fixed, fd, indent=2)

    with open('../data_fixed_mongo_camel.json', 'w', encoding='utf-8') as fd:
        result = []
        for key in data_fixed.keys():
            legislation = data_fixed[key]
            legislation['_id'] = key
            result.append (legislation)
        json.dump(result, fd, indent=2)
