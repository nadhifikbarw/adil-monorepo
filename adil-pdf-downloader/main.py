from firebase_admin import credentials
from firebase_admin import firestore
from urllib.error import HTTPError
from pathlib import Path
import urllib.request
import firebase_admin
import urllib
import os

if __name__ == '__main__':
    dry_run = False
    credential = '../serviceAccountKey.json'
    if os.path.exists(credential) is not True:
        print("Please provide serviceAccountKey.json")
        exit(1)

    # Authenticate service account
    credential = credentials.Certificate(credential)
    firebase_admin.initialize_app(credential)
    db = firestore.client()

    # Set working dir to current folder
    os.chdir(Path(__file__).parent)

    # Setup output folder
    os.makedirs('docs', exist_ok=True)

    # Set user agent
    opener = urllib.request.build_opener()
    opener.addheaders = [(
        'User-Agent', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0'
    )]
    urllib.request.install_opener(opener)

    # Download all document
    docs = db.collection("legislation").stream()

    for doc in docs:
        filename = f"{doc.id}.0.pdf"
        document = doc.to_dict()['document'][0]
        url = document.replace(' ', '%20')
        if not dry_run:
            try:
                urllib.request.urlretrieve(url, f"docs/{filename}",)
                print(f"Downloading {filename} OK")
            except HTTPError as e:
                print(f"Downloading {filename} FAIL {e.code} - {url}")
        else:
            print(f"Downloading {filename} OK - Dry Run")

