const admin = require("firebase-admin");
const functions = require("firebase-functions");


exports.getTimeline = functions
    .region("asia-southeast2")
    .https
    .onCall(async (data, context) => {
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

      // Get document from Firestore
      let doc = await admin.firestore().collection("legislation").doc(docId).get();
      if (!doc.exists) {
        throw new functions.https.HttpsError("aborted", `Document ${docId} does not exist in collection`);
      }
      doc = doc.data();

      // Create timeline
      let timeline = [{
        "id": docId,
        "jenisPeraturan": doc["jenisPeraturan"],
        "tglDiundangkan": doc["tglDiundangkan"],
        "tahunPeraturan": doc["tahunPeraturan"],
        "tglDitetapkan": doc["tglDitetapkan"],
        "tentang": doc["tentang"],
        "nomorPeraturan": doc["nomorPeraturan"],
        "hasDocument": true,
        "type": "this",
      }];

      for (const key of ["mencabut", "mengubah", "diubahOleh", "dicabutOleh"]) {
        const relationships = doc[key];
        relationships.forEach((d) => {
          d["type"] = key;
        });
        timeline = [...timeline, ...relationships];
      }

      timeline.sort((a, b) => {
        return (new Date(a["tglDitetapkan"])) - (new Date(b["tglDitetapkan"]));
      });

      return timeline;
    });
