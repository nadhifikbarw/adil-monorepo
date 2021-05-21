const admin = require("firebase-admin");
admin.initializeApp();

const {rebuildIndex} = require("./rebuildIndex");
const syncIndex = require("./syncIndex");
const getSignedUrl = require("./getSignedUrl");

exports.rebuildIndex = rebuildIndex;
exports.handleCreate = syncIndex.handleCreate;
exports.handleUpdate = syncIndex.handleUpdate;
exports.handleDelete = syncIndex.handleDelete;
exports.getSignedUrl = getSignedUrl.getSignedUrl;
