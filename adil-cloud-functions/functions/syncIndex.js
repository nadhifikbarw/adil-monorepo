const functions = require("firebase-functions");
const {getESClient} = require("./elasticsearch");
const {createBody} = require("./utils");

exports.handleCreate = functions
    .region("asia-southeast2")
    .firestore.document("legislation/{docId}")
    .onCreate(async (snapshot, context) => {
      // Get client
      const client = await getESClient();

      // Get new document data
      const data = await snapshot.data();

      // Rebuild index
      await client.index({
        id: context.params.docId,
        index: "legislation",
        body: createBody(data),
      });
      functions.logger.log(`Document ${context.params.docId} index rebuilt`);

      return {
        documents: [context.params.docId],
        status: "INDEX_REBUILT",
      };
    });

exports.handleUpdate = functions
    .region("asia-southeast2")
    .firestore.document("legislation/{docId}")
    .onUpdate(async (change, context) => {
      // Get client
      const client = await getESClient();

      // Get new document data
      const data = await change.after.data();

      // Rebuild index
      await client.index({
        id: context.params.docId,
        index: "legislation",
        body: createBody(data),
      });
      functions.logger.log(`Document ${context.params.docId} index rebuilt`);

      return {
        documents: [context.params.docId],
        status: "INDEX_REBUILT",
      };
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
