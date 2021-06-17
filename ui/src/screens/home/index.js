import BottomSheet from '@gorhom/bottom-sheet';
import * as React from 'react';
import {Button, Text, TextInput, TouchableOpacity, View, StatusBar} from 'react-native';
import {ListItem } from 'react-native-elements';
import BottonSheetUI from '../../components/bottomSheetUI';
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
    selectAvailableWeightUnits = () => {
            this.setState({isVisiblre:!this.state.isVisible})
    }
    render() {
        return (
            
            <View style={{backgroundColor:"#EDEDED"}}>
                
                {/* <Categories /> */}
                <Catalog navigation={this.props.navigation} selectAvailableWeightUnits={() => this.selectAvailableWeightUnits()}/>
                <BottonSheetUI />
                {/* <BottonSheetUI /> */}
            </View>
            
            
        )
    }
}
