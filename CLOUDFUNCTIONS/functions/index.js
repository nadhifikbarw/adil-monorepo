const functions = require("firebase-functions");
const admin = require('firebase-admin');
const { Client } = require('@elastic/elasticsearch')

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//   functions.logger.info("Hello logs!", {structuredData: true});
//   response.send("Hello from Firebase!");
// });

admin.initializeApp(functions.config().firebase);

const env = functions.config();
const auth = {
  username: env.elasticsearch.username,
  password: env.elasticsearch.password,
};

const client = new Client({
    node: env.elasticsearch.url,
    auth: auth
})


exports.createPost = functions.firestore

//count bisa dijadikan id?
    .document('category/{count}')
    .onCreate( async (snap, context) => {
        await client.index({
            //index disini masih gatau di isi apa tp gue buat categories
            index: 'categories',
            type: '_doc',
            id: snap.id,
            body: snap.data()
        })
    });

exports.updatePost = functions.firestore
    .document('category/{count}')
    .onUpdate( async (snap, context) => {
        await client.update({
            index: 'categories',
            type: '_doc',
            id: context.params.count,
            body: snap.after.data()
        })
    });

exports.deletePost = functions.firestore
    .document('category/{count}')
    .onDelete( snap => {
        client.delete({
            index: 'categories',
            type: '_doc',
            id: snap.id,
        })
    });