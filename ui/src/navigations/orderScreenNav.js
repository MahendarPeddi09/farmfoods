import {createStackNavigator} from '@react-navigation/stack';
import {NavigationContainer} from '@react-navigation/native';
import React, { Component } from 'react';
import Login from '../screens/login';
import HomeNavigation from './homeNavigation';
import Home from '../screens/home';
import ItemDetailsPage from '../screens/itemDetail';
import Orders from '../screens/orders';



const OrderStack = createStackNavigator();

export default function OrderScreenNav(){
    return(
            <OrderStack.Navigator>
                <OrderStack.Screen 
                name = "Orders" 
                component={Orders} 
                options={{title:"Orders"}}
                />
                <OrderStack.Screen name = "DetailScreen" component={ItemDetailsPage} 
                />
            </OrderStack.Navigator>
    )
}
 