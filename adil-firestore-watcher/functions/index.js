const functions = require("firebase-functions");
const {Client} = require("@elastic/elasticsearch");

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//   functions.logger.info("Hello logs!", {structuredData: true});
//   response.send("Hello from Firebase!");
// });

const createESClient = () => {
  const client = new Client({
    cloud: {
      id: functions.config().elasticsearch.cloudid,
    },
    auth: {
      username: functions.config().elasticsearch.username,
      password: functions.config().elasticsearch.password,
    },
  });
  if (!client && !client.ping()) {
    throw new Error("ES Error: client does not respond to ping");
  }
  return client;
};

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

async function createHandler(client, change, context) {
  const data = change.after.data();
  if (!data) {
    throw new Error("Handling error: malformed create data");
  }
  const {exist} = await client.exists({
    id: context.params.docId,
    index: "legislation",
  });
  if (!exist) {
    await client.create({
      id: context.params.docId,
      index: "legislation",
      body: createBody(data),
    });
    console.log(`Operation log: document ${context.params.docId} created`);
  } else {
    await updateHandler(client, change, context);
  }
}

async function updateHandler(client, change, context) {
  const data = change.after.data();
  if (!data) {
    throw new Error("Handling error: malformed update data");
  }
  const {exist} = await client.exists({
    id: context.params.docId,
    index: "legislation",
  });
  if (exist) {
    await client.update({
      id: context.params.docId,
      index: "legislation",
      body: {
        doc: createBody(data),
      },
    });
    console.log(`Operation log: document ${context.params.docId} updated`);
  } else {
    await createHandler(client, change, context);
  }
}

async function deleteHandler(client, change, context) {
  await client.indices.delete({
    index: "legislation",
    id: context.params.docId,
    ignore_unavailable: true,
  });
  console.log(`Operation log: document ${context.params.docId} deleted`);
}

exports.syncIndex = functions
    .region("asia-southeast2")
    .firestore
    .document("legislation/{docId}")
    .onWrite((change, context) => {
      try {
        const client = createESClient();
        if (change.after.exists && !change.before.exists) {
          return createHandler(client, change, context);
        } else if (change.after.exists && change.before.exists) {
          return updateHandler(client, change, context);
        } else if (!change.after.exists && change.before.exists) {
          return deleteHandler(client, change, context);
        } else {
          console.error(new Error("Handling error: unknown mode"));
        }
      } catch (err) {
        console.error(err);
      }
    });
