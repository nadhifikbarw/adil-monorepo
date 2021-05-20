const {rebuildIndex} = require("./rebuildIndex");
const syncIndex = require("./syncIndex");

exports.rebuildIndex = rebuildIndex;
exports.handleCreate = syncIndex.handleCreate;
exports.handleUpdate = syncIndex.handleUpdate;
exports.handleDelete = syncIndex.handleDelete;
