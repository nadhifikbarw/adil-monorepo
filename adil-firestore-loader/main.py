from firebase_admin import credentials
from firebase_admin import firestore
from pathlib import Path
import firebase_admin
import string
import json
import os

translator = str.maketrans('', '', string.punctuation)


def snakeify(text:str):
    return " ".join(text.translate(translator).lower().strip().split()).replace(' ', '_')


if __name__ == '__main__':
    credential = '../serviceAccountKey.json'
    # Authenticate service account
    credential = credentials.Certificate(credential)
    firebase_admin.initialize_app(credential)
    db = firestore.client()

    # Set working dir to current folder
    os.chdir(Path(__file__).parent)

    # Load json data
    with open('../data_fixed_firestore.json', 'r', encoding='utf-8') as fp:
        docs = json.load(fp)

    # Create batch
    batch = db.batch()

    # Build categories
    categories = dict()
    for key in docs.keys():
        doc = docs[key]
        for cat in doc['category']:
            cat_key = snakeify(cat)
            if cat_key in categories.keys():
                categories[cat_key]['count'] += 1
            else:
                categories[cat_key] = {'name': cat, 'count': 1}

        batch.set(
            db.collection('legislation').document(key),
            doc
        )
        print(f"Document {key} loaded")

    # Load legislation done
    print(f"{len(docs)} documents loaded")

    # Load category data
    for key in categories.keys():
        cat = categories[key]
        batch.set(
            db.collection('category').document(key),
            cat
        )
    print(f"{len(categories)} documents loaded")

    print(f"Commit batch...")
    batch.commit()
    print(f"Batch committed")

