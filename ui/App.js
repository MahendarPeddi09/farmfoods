/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import AuthStack from './src/navigations/authNavigation';
import HomeNavigation from './src/navigations/homeNavigation';
import SplashScreen from 'react-native-splash-screen';
import { NavigationContainer } from '@react-navigation/native';


const App = () => {
  SplashScreen.hide();
  return (
    // <AuthStack />
      <AuthStack />
      // {/* <HomeNavigation /> */}
  );
};

export default App;
