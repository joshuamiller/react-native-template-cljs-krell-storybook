#!/usr/bin/env node

var fs = require('fs');

fs.rename("_storybook", ".storybook", function (err) {
  if (err) throw err;
});

fs.rename("_nvmrc", ".nvmrc", function (err) {
  if (err) throw err;
});
