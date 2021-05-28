import json

if __name__ == '__main__':
    out = []
    with open("../adil-crawler/export/peraturan_wide_2021-05-28", 'r', encoding='utf-8') as fd:
        docs = json.load(fd)
        for doc in docs:
            out.append({
                "_id": doc["id"],
                "judul": f"{doc['jenis_peraturan']} {doc['nomor_peraturan']} {doc['tahun_peraturan']}",
                "tentang": doc["tentang"]
            })

    with open("../peraturan_wide_mongo.json", 'w', encoding='utf-8') as fd:
        json.dump(out, fd, indent=2)
