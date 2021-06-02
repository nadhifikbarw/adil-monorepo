const getFields = () => [
  "jenisPeraturan",
  "nomorPeraturan",
  "tahunPeraturan",
  "tentang",
  "tglDitetapkan",
  "tglDiundangkan",
  "category",
  "instansi",
  "daerahId",
];

exports.createBody = (data) => {
  const body = {};
  const fields = getFields();
  for (const field of fields) {
    body[field] = data[field];
  }
  return body;
};

exports.cleanKeyword = (keyword) => {
  return keyword
      .replace(/\W/gm, " ")
      .replace(/\s+/gm, " ")
      .trim();
};
