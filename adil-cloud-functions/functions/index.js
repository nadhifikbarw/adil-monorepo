const admin = require("firebase-admin");
admin.initializeApp();

const syncIndex = require("./syncIndex");
const getSignedUrl = require("./getSignedUrl");
const {rebuildIndex} = require("./rebuildIndex");
const queryLegislation = require("./queryLegislation");
const syncPlaintextIndex = require("./syncPlaintextIndex");

exports.rebuildIndex = rebuildIndex;
exports.handleCreate = syncIndex.handleCreate;
exports.handleUpdate = syncIndex.handleUpdate;
exports.handleDelete = syncIndex.handleDelete;
exports.getSignedUrl = getSignedUrl.getSignedUrl;
exports.queryLegislation = queryLegislation.queryLegislation;
exports.handleDeletePlaintext = syncPlaintextIndex.handleDeletePlaintext;
exports.handleFinalizePlaintext = syncPlaintextIndex.handleFinalizePlaintext;
