const {getESClient} = require("./elasticsearch");
const functions = require("firebase-functions");

exports.queryLegislation = functions
    .region("asia-southeast2")
    .https
    .onCall(async (data, context) => {
    // Check query dat6
      const keyword = data.query || "";
      functions.logger.debug(`Query value: ${keyword}`);
      if (!(typeof keyword === "string") || keyword.length === 0) {
        throw new functions.https.HttpsError("invalid-argument", "The function must be called with \"query\" argument");
      }

      // Get ES Client
      const client = await getESClient();

      const {body} = await client.search({
        index: "legislation",
        size: 10,
        pretty: true,
        body: {
          query: {
            query_string: {
              query: keyword,
            },
          },
        },
        _source_excludes: [
          "content",
        ],
      });

      return body;
    });
