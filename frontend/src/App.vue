<template>
  <div id="app">
    <div id = "navigation">
      <ul class="navigation">
        <li><router-link to="/login">Авторизація</router-link></li>
        <li><router-link to="">Розклад</router-link></li>
        <li><router-link to="">Викладачі</router-link></li>
        <li><router-link to="">Успішність</router-link></li>
        <li><router-link to="">Наші досягнення</router-link></li>
        <li><router-link to="">Інформація</router-link></li>
        <li><a href="https://cs5.pikabu.ru/images/big_size_comm_an/2015-11_2/1446990234189914296.gif">Ничесе</a></li>
      </ul>
    </div>
    <router-view/>
  </div>
</template>
<script>
export default {
  name: 'App'
}
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: black;
    margin-top: 0px;
  }
  body{
    background : url("./assets/school.jpg");
    background-size : cover;
    margin: 0px;
  }
  div#navigation{
    background: black;
    margin: 10px 0px 30px 0px;
  ;
  }
  ul.navigation{
    padding: 0px;
    margin: 0px;
  }
  ul.navigation li{
    display: inline;
    font-size: 25px;
    margin: 10px;
  }
  a{
    text-decoration: none;
  }
  a:hover{
    color: orange;
  }
</style>
