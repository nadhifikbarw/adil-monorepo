const getFields = () => [
  "jenis_peraturan",
  "nomor_peraturan",
  "tahun_peraturan",
  "tentang",
  "tgl_ditetapkan",
  "tgl_diundangkan",
  "category",
  "instansi",
  "daerah_id",
];

exports.createBody = (data) => {
  const body = {};
  const fields = getFields();
  for (const field of fields) {
    body[field] = data[field];
  }
  return body;
};
