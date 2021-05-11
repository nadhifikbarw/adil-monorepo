import json
import requests

if __name__ == '__main__':

    with open('./data.json', 'r', encoding='utf-8') as fp:
        legislations = json.load(fp)

    legislations_dict = {}
    for legislation in legislations:
        legislations_dict[legislation['_id']] = legislation

    for legislation in legislations:
        # Check document status
        print(f"Checking {legislation['_id']} integrity")
        status = []
        urls = legislation['document']
        for url in urls:
            code = requests.head(url).status_code
            status.append(code)
        legislation['document_status'] = status
        print(status)
        # Rebuild relationship
        print(f"Rebuilding {legislation['_id']} relationship integrity")
        for field in [
            "memiliki_dasar_hukum",
            "dasar_hukum_dari",
            "mencabut",
            "dilaksanakan_oleh_peraturan_pelaksana",
            "ditafsirkan",
            "diubah_oleh",
            "dicabut_oleh",
            "mengubah",
            "menafsirkan",
            "peraturan_pelaksana_dari"
        ]:
            new_rels = []
            for rel in legislation[field]:
                new_rel = {
                    "id": rel['id'],
                    "jenis_peraturan": "",
                    "nomor_peraturan": "",
                    "tahun_peraturan": 0,
                    "tgl_ditetapkan": "",
                    "tgl_diundangkan": "",
                    "tentang": "",
                    "has_document": False
                }
                # Copy value from legislation
                doc = legislations_dict.get(rel['id'])
                if(doc):
                    for key in new_rel.keys():
                        if key == "id" or key == "has_document": continue
                        new_rel[key] = doc[key]
                    new_rel["has_document"] = True
                new_rels.append(new_rel)
            legislation[field] = new_rels

    with open('data_out.json', 'w', encoding='utf-8') as fp:
        json.dump(legislations, fp, indent=2)
