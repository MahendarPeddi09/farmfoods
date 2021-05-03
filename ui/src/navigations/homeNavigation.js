import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import {createBottomTabNavigator} from '@react-navigation/bottom-tabs';
import {NavigationContainer} from '@react-navigation/native';
import React from 'react';
import HomeScreenNav from '../navigations/homeScreenNav';
import Orders from '../screens/orders';
import Settings from '../screens/settings';
import OrderScreenNav from './orderScreenNav';
import { Icon } from 'react-native-elements';
import MaterialIcons from 'react-native-vector-icons/MaterialIcons';
import Ionicons from 'react-native-vector-icons/Ionicons';



const Tab = createBottomTabNavigator();

export default function HomeNavigation() {


    console.log(Tab)
  return (

        <Tab.Navigator
        initialRouteName="Home"
        tabBarOptions={
          {
            adaptive:true,
            style:{
              
            },
            showLabel:true,
            labelStyle:{
              color:"#1EE93F"
            }
          }
        }
        // screenOptions={({ route }) => ({
        //   tabBarIcon: ({ focused, color, size }) => {
        //     let iconName;

        //     if (route.name === 'Home') {
        //       iconName = focused
        //         ? 'bed'
        //         : 'bed';
        //     } else if (route.name === 'Settings') {
        //       iconName = focused ? 'bed' : 'bed';
        //     }

        //     // You can return any component that you like here!
        //     return <Ionicons name={iconName} size={size} color={color} />;
        //   },
        // })}
        // tabBarOptions={{
        //   activeTintColor: 'tomato',
        //   inactiveTintColor: 'gray',
        // }}
        >
            <Tab.Screen name="Home" component={HomeScreenNav} />
            <Tab.Screen name="Orders" component={OrderScreenNav} />
            <Tab.Screen name="Settings" component={Settings} />
        </Tab.Navigator>
  );
}