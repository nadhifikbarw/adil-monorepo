module.exports = {
  root: true,
  env: {
    es6: true,
    node: true,
  },
  extends: [
    "eslint:recommended",
    "google",
  ],
  rules: {
    "quotes": ["error", "double"],
    "require-jsdoc": 0,
    "max-len": 0,
  },
  parserOptions: {
    "ecmaVersion": 8,
  },
};
