const webpack = require('webpack');
const path = require('path');
const rootDir = path.join(__dirname, '..');
module.exports = {
  "stories": [
    "../js/**/*.stories.mdx",
    "../js/**/*.stories.@(js|jsx|ts|tsx)"
  ],
  "addons": [
    "@storybook/addon-links",
    "@storybook/addon-essentials",
    "@storybook/addon-interactions",
    "@storybook/addon-react-native-web"
  ],
  "framework": "@storybook/react"
};
