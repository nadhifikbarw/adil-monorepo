import json

if __name__ == '__main__':
    with open('./data_mongo.json', 'r', encoding='utf-8') as fp:
        legislations = json.load(fp)

    results = {}
    for legislation in legislations:
        id = legislation.pop('_id', None)
        results[id] = legislation

    with open('./data_firestore.json', 'w', encoding='utf-8') as fp:
        json.dump(results, fp, indent=2)