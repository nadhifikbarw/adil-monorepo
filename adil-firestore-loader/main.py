from firebase_admin import credentials
from firebase_admin import firestore
from pathlib import Path
import firebase_admin
import settings
import json
import os

if __name__ == '__main__':
    collection = settings.COLLECTION_NAME
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

    # Iterate data
    for key in docs.keys():
        doc = docs[key]
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
            doc[field] = doc[field] if doc[field] else []
        # Normalize datatype to empty string
        for field in ["daerah_id", "instansi"]:
            doc[field] = doc[field] if doc[field] else ""

        db.collection(collection).document(key).set(doc)
        print(f"Document {key} loaded")

    print(f"{len(docs)} documents loaded")
