from firebase_admin import credentials
from firebase_admin import firestore
from pathlib import Path
import firebase_admin
import settings
import json
import os
import string

translator = str.maketrans('', '', string.punctuation)


def snakeify(text:str):
    return " ".join(text.translate(translator).lower().strip().split()).replace(' ', '_')


if __name__ == '__main__':
    credential = settings.CREDENTIAL_PATH

    # Set working dir to current folder
    os.chdir(Path(__file__).parent)

    # Load json data
    with open('../adil-data-exploration/peraturan_fixed.json', 'r', encoding='utf-8') as f:
        docs = json.load(f)

    # Authenticate service account
    credential = credentials.Certificate(credential)
    firebase_admin.initialize_app(credential)
    db = firestore.client()

    # Create batch
    batch = db.batch()

    # Normalize Field and count category
    categories = dict()
    for key in docs.keys():
        doc = docs[key]
        for cat in doc['category']:
            cat_key = snakeify(cat)
            if cat_key in categories.keys():
                categories[cat_key]['count'] += 1
            else:
                categories[cat_key] = {'name': cat, 'count': 1}

        # Normalize datatype to empty list
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
            related_docs = doc[field] if doc[field] else []
            results = []
            if len(related_docs) > 0:
                for related_doc_key in related_docs:
                    data = {
                        'id': related_doc_key,
                        'jenis_peraturan': None,
                        'nomor_peraturan': None,
                        'tahun_peraturan': None,
                    }
                    if related_doc_key in docs.keys():
                        # Copy data
                        related_doc = docs[related_doc_key]
                        data['jenis_peraturan'] = related_doc['jenis_peraturan']
                        data['nomor_peraturan'] = related_doc['nomor_peraturan']
                        data['tahun_peraturan'] = related_doc['tahun_peraturan']
                    results.append(data)
            doc[field] = results

        # Normalize datatype to empty string
        for field in ["daerah_id", "instansi"]:
            doc[field] = doc[field] if doc[field] else ""

        doc['tahun_peraturan'] = int(doc['tahun_peraturan'])

        print(f"Document {key} normalized")
        batch.set(
            db.collection('legislation').document(key),
            doc
        )
        # db.collections('legislation').document(key).set(doc)
        print(f"Document {key} loaded")
        print(doc)

    # Load legislation
    print(f"{len(docs)} documents loaded")

    # Load category data
    for key in categories.keys():
        cat = categories[key]
        batch.set(
            db.collection('category').document(key),
            cat
        )
        # print(f"Document {key} loaded")
    print(f"{len(categories)} documents loaded")

    print(f"Commit batch...")
    # batch.commit()
    print(f"Batch committed")

