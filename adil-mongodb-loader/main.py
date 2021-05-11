import os
import json
import string
import pymongo
from pathlib import Path

translator = str.maketrans('', '', string.punctuation)


def snakeify(text:str):
    return " ".join(text.translate(translator).lower().strip().split()).replace(' ', '_')


if __name__ == '__main__':
    #  Setup mongodb connection
    connection_url = 'mongodb://localhost:27017'
    client = pymongo.MongoClient(connection_url)
    database = client['adil-poc']

    # Set working dir to current folder
    os.chdir(Path(__file__).parent)

    # Load JSON data
    with open('../data_fixed_mongo.json', 'r', encoding='utf-8') as f:
        docs = json.load(f)

    # Count category
    categories = dict()
    for doc in docs:
        for cat in doc['category']:
            cat_key = snakeify(cat)
            if cat_key in categories.keys():
                categories[cat_key]['count'] += 1
            else:
                categories[cat_key] = {'name': cat, 'count': 1}

    # Load legislation
    batch = docs
    print(f"{len(docs)} documents loaded")

    # Load category data
    batch_category = []
    for key in categories.keys():
        cat = categories[key]
        cat['_id'] = key
        batch_category.append(cat)
        # print(f"Document {key} loaded")
    print(f"{len(categories)} documents loaded")

    # Committing batch
    print(f"Commit batch...")
    for col in ['legislation', 'category']:
        database.drop_collection(col)
        database.create_collection(col)
    database['legislation'].insert_many(batch)
    database['category'].insert_many(batch_category)
    print(f"Batch committed")

