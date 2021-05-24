const {getESClient} = require("./elasticsearch");
const functions = require("firebase-functions");
const admin = require("firebase-admin");
const path = require("path");

const validateConstrains = (object) => {
  functions.logger.debug(`Validating ${object.name} constraints`);
  functions.logger.debug(`Content type: ${object.contentType}`);
  if (object.contentType !== "text/plain") {
    functions.logger.debug(`${object.name} is not an text/plain`);
    return false;
  }

  const fileName = path.basename(object.name);
  functions.logger.debug(`Filename: ${fileName}`);
  if (fileName.split(".").length === 3) {
    functions.logger.debug(`${object.name} filename is malformed`);
    return false;
  }

  return true;
};

exports.handleFinalizePlaintext = functions
    .region("asia-southeast2")
    .storage
    .bucket("adil-plaintext")
    .object()
    .onFinalize(async (object, context) => {
      // Check constraints
      const valid = validateConstrains(object);
      if (!valid) {
        return functions.logger.log(`${object.name} does not pass constraints checking. Index building skipped`);
      }

      // Get client
      const client = await getESClient();

      // Check if index exists
      const fileName = path.basename(object.name);
      const id = fileName.split(".")[0];

      // Get text data
      const text = (await admin.storage().bucket(object.bucket).file(object.name).download()).toString();

      client.update({
        id: id,
        index: "legislation",
        body: {
          doc: {
            content: text,
          },
          doc_as_upsert: true,
        },
      });
      return functions.logger.log(`Document ${id} index rebuilt`);
    });

exports.handleDeletePlaintext = functions
    .region("asia-southeast2")
    .storage
    .bucket("adil-plaintext")
    .object()
    .onDelete(async (object, context) => {
      // Check constraints
      const valid = validateConstrains(object);
      if (!valid) {
        return functions.logger.log(`${object.name} does not pass constraints checking. Index building skipped`);
      }

      // Get client
      const client = await getESClient();

      // Check if index exists
      const fileName = path.basename(object.name);
      const id = fileName.split(".")[0];
      const {exists} = await client.exists({
        id: id,
        index: "legislation",
      });

      if (exists) {
        await client.update({
          id: id,
          index: "legislation",
          body: {
            doc: {
              content: "",
            },
          },
        });
        return functions.logger.log(`Document ${id} index deleted`);
      } else {
        return functions.logger.log(`Document ${id} index not found`);
      }
    });
