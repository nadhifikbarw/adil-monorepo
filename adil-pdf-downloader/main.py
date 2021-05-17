from firebase_admin import credentials
from firebase_admin import firestore
from pathlib import Path
import urllib.request
import firebase_admin
import os

if __name__ == '__main__':
    dry_run = False
    credential = './serviceAccountKey.json'
    # Authenticate service account
    credential = credentials.Certificate(credential)
    firebase_admin.initialize_app(credential)
    db = firestore.client()

    # Set working dir to current folder
    os.chdir(Path(__file__).parent)

    # Setup output folder
    os.makedirs('docs', exist_ok=True)

    docs = db.collection("legislation").stream()

    for doc in docs:
        filename = f"{doc.id}.0.pdf"
        document = doc.to_dict()['document'][0]
        url = document.replace(' ', '%20')
        print(f"Downloading {filename}")
        if not dry_run:
            urllib.request.urlretrieve(url, f"docs/{filename}")
