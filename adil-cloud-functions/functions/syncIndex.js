const {getESClient} = require("./elasticsearch");
const functions = require("firebase-functions");
const admin = require("firebase-admin");
const {createBody} = require("./utils");

const bucket = admin.storage().bucket("adil-plaintext");

const handleUpsert = async (data, context, client) => {
  // Rebuild index
  const doc = createBody(data);

  // Insert content plaintext if exists
  const file = bucket.file(`${context.params.docId}.0.txt`);
  if (await file.exists()) {
    doc["content"] = (await file.download()).toString();
  }

  await client.update({
    id: context.params.docId,
    index: "legislation",
    body: {
      doc: doc,
      doc_as_upsert: true,
    },
  });
  functions.logger.log(`Document ${context.params.docId} index rebuilt`);

  return {
    documents: [context.params.docId],
    status: "INDEX_REBUILT",
  };
};

exports.handleCreate = functions
    .region("asia-southeast2")
    .firestore.document("legislation/{docId}")
    .onCreate(async (snapshot, context) => {
      // Get client
      const client = await getESClient();

      // Get new document data
      const data = await snapshot.data();

      // Rebuild index
      return await handleUpsert(data, context, client);
    });

exports.handleUpdate = functions
    .region("asia-southeast2")
    .firestore.document("legislation/{docId}")
    .onUpdate(async (change, context) => {
      // Get client
      const client = await getESClient();

      // Get new document data
      const data = await change.after.data();

      // TODO: check diff, if in fields then rebuild index else skip

      // Rebuild Index
      return await handleUpsert(data, context, client);
    });

exports.handleDelete = functions
    .region("asia-southeast2")
    .firestore.document("legislation/{docId}")
    .onDelete(async (snapshot, context) => {
      // Get client
      const client = await getESClient();

      // Options
      const options = {
        id: context.params.docId,
        index: "legislation",
      };

      // Check existence
      const {exists} = await client.exists(options);

      // Remove document
      if (exists) {
        await client.delete(options);
        functions.logger.log(`Document ${context.params.docId} index deleted`);
      } else {
        functions.logger.log(`Document ${context.params.docId} index not found`);
      }

      return {
        documents: [context.params.docId],
        status: "INDEX_DELETED",
      };
    });
