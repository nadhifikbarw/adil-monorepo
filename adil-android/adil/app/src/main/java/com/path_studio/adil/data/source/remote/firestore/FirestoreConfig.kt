package com.path_studio.adil.data.source.remote.firestore

import com.google.firebase.firestore.FirebaseFirestore

class FirestoreConfig {
    companion object{
        fun getFirestoreService(): FirebaseFirestore{
            return FirebaseFirestore.getInstance()
        }
    }
}