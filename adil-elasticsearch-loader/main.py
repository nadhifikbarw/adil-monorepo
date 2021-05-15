import json
from elasticsearch import Elasticsearch

if __name__ == '__main__':
    _es = Elasticsearch([{
        'host': 'localhost',
        'port': 9200
    }])
    assert(_es.ping())

    with open('../data_fixed_firestore.json', 'r', encoding='utf-8') as fp:
        data = json.load(fp)
    assert(data)
    print('Data loaded')

    for key in data.keys():
        doc = data[key]
        new_doc = {}
        for field in [
            'jenis_peraturan',
            'nomor_peraturan',
            'tahun_peraturan',
            'tentang',
            'tgl_ditetapkan',
            'tgl_diundangkan',
            'category'
        ]:
            new_doc[field] = doc[field]

        _es.index(index='legislation', id=key, body=new_doc)
        print(f"Docuemnt {key} loaded")
