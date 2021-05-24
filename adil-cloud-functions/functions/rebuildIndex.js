const admin = require("firebase-admin");
const functions = require("firebase-functions");
const {getESClient} = require("./elasticsearch");
const {createBody} = require("./utils");

const db = admin.firestore();
const bucket = admin.storage().bucket("adil-plaintext");

exports.rebuildIndex = functions
    .region("asia-southeast2")
    .https
    .onCall(async (data) => {
      // Validate document id parameter
      functions.logger.debug("Checking \"docId\" parameter");
      const docId = data.docId || null;
      functions.logger.debug(`docId value: ${docId}`);
      if (!(typeof docId === "string") || docId.length === 0) {
        functions.logger.debug("docId parameter is malformed");
        throw new functions.https.HttpsError(
            "invalid-argument",
            "The function must be called with \"docId\" argument specifying one document id or \"_all\" value");
      }

      // Get ES Client;
      const client = await getESClient();

      // List document that need to be processed
      let documents = [];
      if (docId === "_all") {
        const docs = await db.collection("legislation").get();
        documents = docs.docs;
      } else {
        const doc = await db.collection("legislation").doc(docId).get();
        if (!doc.exists) {
          throw new functions.https.HttpsError("aborted", `Document ${docId} does not exist in collection`);
        } else {
          documents.push(doc);
        }
      }

      // Rebuild index
      const success = [];
      functions.logger.debug(`Rebuilding ${documents.length} documents`);
      for (const doc of documents) {
        // Create metadata body
        const body = createBody(await doc.data());

        // Insert content plaintext if exists
        const file = bucket.file(`${doc.id}.0.txt`);
        if (await file.exists()) {
          body["content"] = (await file.download()).toString();
        }

        await client.update({
          id: doc.id,
          index: "legislation",
          body: {
            doc: body,
            doc_as_upsert: true,
          },
        });

        success.push(doc.id);
        functions.logger.log(`Document ${doc.id} index rebuilt`);
      }

      return {
        documents: success,
        status: "INDEX_REBUILT",
      };
    });
