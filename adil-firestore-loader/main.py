from firebase_admin import credentials
from firebase_admin import firestore
import firebase_admin
import json

if __name__ == '__main__':
    credential = '../serviceAccountKey.json'
    # Authenticate service account
    credential = credentials.Certificate(credential)
    firebase_admin.initialize_app(credential)
    db = firestore.client()

    # Model
    #

    # Load json data
    with open('../data_fixed_firestore_camel.json', 'r', encoding='utf-8') as fp:
        docs = json.load(fp)

    # Create batch
    batch = db.batch()

    # Build categories
    categories = dict()
    for key, doc in docs.items():
        batch.set(
            db.collection('legislation').document(key),
            doc
        )
        print(f"Document {key} loaded")

    # Load legislation done
    print(f"{len(docs)} documents loaded")
    print(f"Commit batch...")
    batch.commit()
    print(f"Batch committed")

