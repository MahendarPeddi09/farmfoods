import {createStackNavigator} from '@react-navigation/stack';
import {NavigationContainer} from '@react-navigation/native';
import React, { Component } from 'react';
import ItemDetailsPage from '../screens/itemDetail';



const Stack = createStackNavigator();

export default function AuthStackNavigator(){
    console.log("Hello")
    return(
        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen name = "ItemDetailPage" component={ItemDetailsPage} />
            </Stack.Navigator>
        </NavigationContainer>
    )
}
 