#!/usr/bin/env node

var fs = require('fs');

fs.rename("_storybook", ".storybook", function (err) {
  if (err) throw err;
});
