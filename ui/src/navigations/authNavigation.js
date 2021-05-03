import {createStackNavigator} from '@react-navigation/stack';
import {NavigationContainer} from '@react-navigation/native';
import React, { Component } from 'react';
import Login from '../screens/login';
import HomeNavigation from './homeNavigation';
import Home from '../screens/home';



const Stack = createStackNavigator();

export default function AuthStackNavigator(){
    return(
        <NavigationContainer>
            <Stack.Navigator
            headerMode='none'>               
                <Stack.Screen name = "Home" component={HomeNavigation} />
                <Stack.Screen name = "Login" component={Login} />
            </Stack.Navigator>
        </NavigationContainer>
    )
}
 