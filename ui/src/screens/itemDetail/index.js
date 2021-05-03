import React, { Component,useState } from 'react'
import { SafeAreaView, Text, View,StyleSheet, Modal } from 'react-native'
import { Image } from 'react-native-elements'
import { BottomSheet } from 'react-native-elements/dist/bottomSheet/BottomSheet'
import { Button } from 'react-native-elements/dist/buttons/Button'
import { ListItem } from 'react-native-elements/dist/list/ListItem'
import { ScrollView } from 'react-native-gesture-handler'
import { Dialog, Portal } from 'react-native-paper'


export default class ItemDetailsPage extends Component {
    render() {
        return (
                <View style={{flex:1}}>
                    <ScrollView style={styles.container} >
                        <View style={styles.carousel}>
                        <Image 
                        source={ require('../../assets/img/sharon-pittaway-KUZnfk-2DSQ-unsplash.jpg') }
                        style={{height:"100%", width:"100%", borderRadius:5}}/>
                        </View>
                        <View style={styles.product_select}>
                            <View>
                                <Text style={{fontWeight:"bold", fontSize:20}}>
                                    Vegetable
                                </Text>
                                <Text style={{fontWeight:"bold", fontSize:30}}>
                                    100
                                </Text>
                                <Text>
                                    Available Total Quantity:5 kg
                                </Text>
                            </View>
                            <View style={{height:50}}>
                                
                            </View>
                            <View style={styles.actionBox}>
                                <Button title="Add To Cart" buttonStyle={{borderRadius:10,backgroundColor:"#90dd09"}} />
                                <View style={styles.actionBox_save}>
                                    <Button title="Save" containerStyle={{backgroundColor:"orange",flex:1, marginRight:2}} />
                                    <Button title="Go To Cart" containerStyle={{backgroundColor:"red",flex:1, marginLeft:2}} />
                                </View>
                                
                            </View>

                        </View>
                        <View style={styles.produat_info}>
                            <View >
                                <Text style={{fontWeight:"bold",height:500}}>
                                    About this product
                                </Text>
                            </View>
                            <View>

                            </View>
                        </View>
                        
                    </ScrollView>
                    

                </View>
        )
    }
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        height:"100%"
    },
    carousel:{
        minHeight:250,
        height:"30%",
        maxHeight:300,
        backgroundColor:"black",
        flex:1

    },
    product_select:{
        padding:5,
        minHeight:200,
        height:"20%",
        flex:1
    },
    produat_info:{
        flex:1,
    },

    actionBox:{
        height:90,
        width:"100%",
        flexDirection:"column",
        flex:1,
        alignContent:"stretch"
    },
    actionBox_save:{
        padding:5,
        paddingTop:10,
        flex:1,
        flexDirection:"row",
        justifyContent:"center",
        
    }

})