import React, { Component } from 'react'
import { FlatList, View, StyleSheet, SafeAreaView, StatusBar, Text } from 'react-native'

export default class Categories extends Component {
    render() {
        const styles = StyleSheet.create({
            container: {
              flex: 1,
              marginTop: StatusBar.currentHeight || 0,
            },
            item: {
              backgroundColor: '#f9c2ff',
              padding: 20,
              marginVertical: 8,
              marginHorizontal: 16,
            },
            title: {
              fontSize: 32,
            },
          });
          const DATA = [
            {
              id: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
              title: 'First Item',
            },
            {
              id: '3ac68afc-c605-48d3-a4f8-fbd91aa97f63',
              title: 'Second Item',
            },
            {
              id: '58694a0f-3da1-471f-bd96-145571e29d72',
              title: 'Third Item',
            },
          ];
          
          const Item = ({ title }) => (
            <View style={styles.item}>
              <Text style={styles.title}>{title}</Text>
            </View>
          );
          const renderItem = ({ item }) => (
            <Item title={item.title} />
          );
        return (
            <SafeAreaView style={styles.container}>
                <Text>
                    Hoiiiii
                </Text>
                <View>
                    <Text>
                        Hello
                    </Text>
                    <FlatList
                    data={DATA}
                    renderItem={renderItem}
                    keyExtractor={item => item.id}
                    />
                </View>
            </SafeAreaView>
        )
    }
}
