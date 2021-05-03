import {createStackNavigator} from '@react-navigation/stack';
import {NavigationContainer} from '@react-navigation/native';
import React, { Component } from 'react';
import Login from '../screens/login';
import HomeNavigation from './homeNavigation';
import Home from '../screens/home';
import ItemDetailsPage from '../screens/itemDetail';



const HomeStack = createStackNavigator();

export default function HomeScreenNav(){
    return(
            <HomeStack.Navigator>
                <HomeStack.Screen 
                name = "Home" 
                component={Home} 
                options={{title:"Home",
                headerStyle:{
                    backgroundColor:"#0F9626"
                }
                }}
                />
                <HomeStack.Screen name = "DetailScreen" component={ItemDetailsPage} 
                />
            </HomeStack.Navigator>
    )
}
 