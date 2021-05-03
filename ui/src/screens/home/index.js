import * as React from 'react';
import {Button, Text, TextInput, TouchableOpacity, View, StatusBar} from 'react-native';
import Catalog from '../../components/catalog';
import Categories from '../../components/categories';
import HomeNavigation from '../../navigations/homeNavigation'

export default class Home extends React.Component {

    constructor(props){
        super(props)

        console.log("///////////",this.props, "======")
    }


    componentDidMount(){
        
    }
    render() {
        return (
            
            <View style={{backgroundColor:"#EDEDED"}}>
                
                {/* <Categories /> */}
                <Catalog navigation={this.props.navigation}/>
            </View>
            
            
        )
    }
}
