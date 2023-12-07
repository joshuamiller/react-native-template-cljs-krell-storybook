/**
 * @format
 * @lint-ignore-every XPLATJSCOPYRIGHT1
 */

import {AppRegistry} from 'react-native';
import App from './.storybook';
import {name as appName} from './app.json';

AppRegistry.registerComponent(appName, () => App);
