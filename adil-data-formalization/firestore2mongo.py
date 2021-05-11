import json

if __name__ == '__main__':
    with open('./data_firestore.json', 'r', encoding='utf-8') as fp:
        legislations = json.load(fp)

    results = []
    for key in legislations.keys():
        legislation = legislations[key]
        legislation['_id'] = key
        results.append(legislation)

    with open('./data_mongo.json', 'w', encoding='utf-8') as fp:
        json.dump(results, fp, indent=2)