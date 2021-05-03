import React, { Component } from 'react'
import { SafeAreaView, SectionList, View, Text, StyleSheet, StatusBar } from 'react-native'
import CatalogItem from './CatalogItem';



export default class index extends Component {

    
    render() {
      
      const Item = ({ title }) => (
          <CatalogItem name={title} style={styles.title}>{title}</CatalogItem>
      );
      const DATA = [
        {
          title: "Vegetables",
          data: ["Brinjol", "Ladies Finger", "Carrot", "Cucum ber"]
        },
        {
          title: "Poultry",
          data: ["Eggs", "Live chicken"]
        },
        {
          title: "Fruits",
          data: ["WaterMelon", "Mangoes", "Lemons"]
        },
        {
          title: "Dairy",
           data: ["Milk", "Curd", "Ghee", "Butter", "Cream"]
        }
      ];
          return (
            <SafeAreaView>
              <View>
                <SectionList 
                  sections={DATA}
                  keyExtractor={(item, index) => item + index}
                  renderItem = {({item}) => <Item title = {item} />}
                  renderSectionHeader={({ section: { title } }) => (
                    <Text style={styles.header}>{title}</Text>
                  )}
                  ListEmptyComponent={() => <Text>No items available</Text>}
                  SectionSeparatorComponent={() => <View style={{marginTop:5, marginBottom:5}}></View>}
                  stickySectionHeadersEnabled={true}
                />
              </View>
            </SafeAreaView>
          );
    }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: StatusBar.currentHeight,
    marginHorizontal: 1
  },
  item: {
    backgroundColor: "#f9c2ff",
    padding: 5,
    marginVertical: 8
  },
  header: {
    fontSize: 20,
    backgroundColor: "#0F9626",
  },
  title: {
    fontSize: 24,
    
  }
});
