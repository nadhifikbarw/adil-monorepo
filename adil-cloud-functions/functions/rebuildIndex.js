const admin = require("firebase-admin");
const functions = require("firebase-functions");
const {getESClient} = require("./elasticsearch");
const {createBody} = require("./utils");

admin.initializeApp();
const db = admin.firestore();

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

      if (docId === "_all") {
        // Get documents
        const docs = await db.collection("legislation").get();
        functions.logger.debug(`Rebuilding ${docs.length} documents`);

        // Rebuild documents
        const documents = [];
        for (const doc of docs) {
          documents.push(doc.id);
          await client.index({
            id: doc.id,
            index: "legislation",
            body: createBody(await doc.data()),
          });
          functions.logger.log(`Document ${doc.id} index rebuilt`);
        }

        return {
          documents,
          status: "INDEX_REBUILT",
        };
      } else {
        // Get document
        const doc = await db.collection("legislation").doc(docId).get();

        // Check existence
        if (!doc.exists) {
          throw new functions.https.HttpsError("aborted", `Document ${docId} does not exist in collection`);
        }

        // Rebuild documents
        functions.logger.debug("Rebuilding 1 document");
        await client.index({
          id: doc.id,
          index: "legislation",
          body: createBody(await doc.data()),
        });
        functions.logger.log(`Document ${doc.id} index rebuilt`);

        return {
          documents: [doc.id],
          status: "INDEX_REBUILT",
        };
      }
    });
