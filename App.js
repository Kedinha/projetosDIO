import React from 'react'
import {
  StyleSheet,
  Image,
  Text,
  View,
  SafeAreaView,
  StatusBar
} from 'react-native'

const colorGithub = '#010409'
const imageMyFamily = './assets/MyWifePet.jpeg'

const App = () => {
  return (
    <SafeAreaView style={styles.container}>
      <StatusBar backgroundColor={colorGithub} barStyle={'ligth-content'} />
      <Image style={styles.avatar} source={{ uri: imageMyFamily }} />
      <View>{/* <Text style={styles.text}>My First App!</Text> */}</View>
    </SafeAreaView>
  )
}

export default App

const styles = StyleSheet.create({
  container: {
    flex: 1, //expande para a tela inteira
    backgroundColor: colorGithub,
    alignItems: 'center',
    justifyContent: 'center'
  },
  avatar: {
    width: 100,
    height: 100,
    borderRadius: 50
  }
  /*   text: {
    fontSize: 30,
    fontWeight: 'bold',
    color: 'blue'
  } */
})
