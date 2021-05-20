const functions = require("firebase-functions");
const _es = require("@elastic/elasticsearch");

exports.getESClient = async () => {
  // Create ES Client
  functions.logger.debug("Creating ElasticSearch client");
  const client = new _es.Client({
    cloud: {
      id: functions.config().elasticsearch.cloudid,
    },
    auth: {
      username: functions.config().elasticsearch.username,
      password: functions.config().elasticsearch.password,
    },
  });
  functions.logger.debug("ElasticSearch client created");

  // Ping with client!
  if ((await client.ping()).body === false) {
    throw new functions.https.HttpsError(
        "failed-precondition",
        "ElasticSearch client does not respond to ping",
    );
  } else {
    functions.logger.debug("ElasticSearch client does respond to ping");
  }
  return client;
};
