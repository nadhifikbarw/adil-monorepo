const admin = require("firebase-admin");
const functions = require("firebase-functions");

const storage = admin.storage();

exports.getSignedUrl = functions
    .region("asia-southeast2")
    .https
    .onCall(async (data, context) => {
      // Validate bucketName params
      const bucketName = data.bucket || null;
      functions.logger.debug(`bucketName parameter: ${bucketName}`);
      if (!(typeof bucketName === "string") || bucketName.length === 0) {
        throw new functions.https.HttpsError(
            "invalid-argument",
            "The function must be called with \"bucket\" argument",
        );
      }
      // Check if bucket exists
      const bucket = storage.bucket(bucketName);
      if (!(await bucket.exists())) {
        throw new functions.https.HttpsError(
            "aborted",
            `Cannot find bucket "${bucket}"`,
        );
      }

      // Check filename parameter
      const filename = data.filename || null;
      functions.logger.debug(`filename parameter: ${filename}`);
      if (!(typeof filename === "string") || filename.length === 0) {
        throw new functions.https.HttpsError(
            "invalid-argument",
            "The function must be called with \"filename\" argument",
        );
      }

      // Check if object exists
      const file = bucket.file(filename);
      if (!(await file.exists())) {
        throw new functions.https.HttpsError(
            "aborted",
            `Cannot find file "${filename}" in "${bucket}"`,
        );
      }

      // Generate signed url
      functions.logger.debug(`Generating Signed URL for gs://${bucketName}/${filename}`);
      const expire = Date.now() + 60 * 60 * 1000; // 1 Hour
      const options = {
        version: "v4",
        action: "read",
        expires: expire,
      };
      functions.logger.debug(`Signed URL expires at ${expire}`);
      const [url] = await file.getSignedUrl(options);
      return {
        bucket: bucketName,
        filename: filename,
        url: url,
        expire_at: expire,
      };
    });
