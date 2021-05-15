const functions = require("firebase-functions");
const admin = require("firebase-admin");
const _es = require("@elastic/elasticsearch");

admin.initializeApp();

const db = admin.firestore();

async function createESClient() {
  const client = new _es.Client({
    cloud: {
      id: functions.config().elasticsearch.cloudid,
    },
    auth: {
      username: functions.config().elasticsearch.username,
      password: functions.config().elasticsearch.password,
    },
  });
  if ((await client.ping()).body === false) {
    throw new Error("ESClient error: client does not respond to ping");
  } else {
    return client;
  }
}

const getFields = () => [
  "jenis_peraturan",
  "nomor_peraturan",
  "tahun_peraturan",
  "tentang",
  "tgl_ditetapkan",
  "tgl_diundangkan",
  "category",
  "instansi",
  "daerah_id",
];

const createBody = (data) => {
  const body = {};
  const fields = getFields();
  for (const field of fields) {
    body[field] = data[field];
  }
  return body;
};

function upsertIndex(client, id, body) {
  return client.index({
    index: "legislation",
    id: id,
    body: body,
  });
}

exports.rebuildIndex = functions
    .region("asia-southeast2")
    .https
    .onCall(async (data, context) => {
      // Validate document id parameter
      const docId = data.docId || null;
      if (!docId) {
        console.error(new Error("Operation error: docId parameter is not supplied"));
        return;
      }

      // Create ES Client;
      const client = await createESClient();
      if (docId === "_all") {
        const docs = await db.collection("legislation").get();
        for (const doc of docs) {
          await upsertIndex(client, doc.id, createBody(await doc.data()));
          console.log(`Operation log: document ${doc.id} index rebuilt`);
        }
      } else {
        const doc = await db.collection("legislation").doc(docId).get();
        if (!doc.exists) {
          console.error(new Error(`Operation error: document ${docId} does not exist`));
          return;
        }
        await upsertIndex(client, docId, createBody(await doc.data()));
        console.log(`Operation log: document ${docId} index rebuilt`);
      }
    });
