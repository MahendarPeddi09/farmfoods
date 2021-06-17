import React from 'react'
import { Card, Image,Divider, Button,BottomSheet, ListItem } from 'react-native-elements';
import {View, Text, StyleSheet} from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { TouchableRipple } from 'react-native-paper';
import { TouchableOpacity } from 'react-native';

export default function CatalogItem(props) {

    const navigation = useNavigation();

    

    return (

            <View style={styles.container}>
                <View style={{flex:1,flexDirection:"row",justifyContent:"flex-start",alignItems:"center", padding:10, margin:0,height:100}}>
                    <View style={{flex:1,alignSelf:"flex-start", padding:0,}}>
                        <Image 
                        source={ require('../../assets/img/sharon-pittaway-KUZnfk-2DSQ-unsplash.jpg') }
                        onPress={() => navigation.navigate('DetailScreen')}
                        style={{height:100, width:100, borderRadius:10, backgroundColor:"transparent"}}/>
                    </View>
                    <TouchableRipple style={{flex:2,alignSelf:"flex-start",}} onPress={() => alert("Hi")}>
                        <View style={{flex:1,flexDirection:"column", padding:0,paddingLeft:0,height:100}}>
                            <View style={{flex:1}}>
                                <Text adjustsFontSizeToFit={false} numberOfLines={1} ellipsizeMode='tail' selectable={true} style={{fontSize:16,fontWeight:"bold", fontStyle:"normal",alignSelf:"stretch",justifyContent:"center"}} >
                                    {props.name}
                                </Text>
                            </View>
                            <TouchableOpacity style={{flex:1, flexDirection:"row"}} onPress={() => props.selectAvailableWeightUnits()}>
                                <View >
                                    <Text style={{fontSize:15,fontStyle:"normal",justifyContent:"center",alignSelf:"flex-start"}}>
                                        measurement
                                    </Text>
                                </View>
                            </TouchableOpacity>
                            <View style={{flex:2,alignSelf:"stretch",justifyContent:"center", flexDirection:"row",padding:0}}>
                                <View style={{flex:1,alignSelf:"stretch",justifyContent:"center", flexDirection:"column", padding:0}}>
                                    <View style={{flex:1}}>
                                        <Text style={{alignSelf:"stretch",justifyContent:"center",fontSize:13}}>
                                            Available : 1000kg
                                        </Text>
                                    </View>
                                    <View style={{flex:2, alignContent:"center",justifyContent:"center"}}>
                                        <Text style={{alignSelf:"flex-start", fontWeight:"bold"}}>
                                            240.00 / kg
                                        </Text>
                                    </View>
                                </View>
                                <View style={{flex:1, alignContent:"center",justifyContent:"center"}}>
                                    <Button title="Add To Cart" titleStyle={{color:"white", fontSize:13,textAlign:"center",paddingTop:0,}}
                                    containerStyle={{}}
                                    buttonStyle={{width:"100%",  borderRadius:5,backgroundColor:"green",}}
                                    />
                                </View>
                            </View>
                        
                    </View>
                    </TouchableRipple>
                    
                    
                </View>
                <Divider style={{ backgroundColor: 'green' }}/>
            </View>
    )
}

//css
const styles = StyleSheet.create({
    container:{padding:0, 
        margin:0,
        borderRadius:5,
        height:120,
        width:"100%"
    }
})
