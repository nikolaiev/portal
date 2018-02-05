<template>
  <div id="app" class="container">
    <div id="background"></div>
    <navigation></navigation>
    <router-view></router-view>
  </div>
</template>

<script>
import Navigation from './components/Navigation'
export default {
  name: 'App',
  components: {
    Navigation
  }
}
</script>

<style>
  #background{
    background : url("./assets/school.jpg");
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: 100%;
    z-index: -1;
    /*opacity: 0.3;*/
    /*filter:alpha(opacity=30);*/
  }
</style>
