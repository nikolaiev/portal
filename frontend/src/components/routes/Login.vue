<template>
  <div class="login">
    <form action = "" method="POST">
      <ul>
        <li class="username">
          <label for="username" title="Six or more characters">User name or email</label>
          <input
            type="text"
            name="username"
            id="username"
            pattern="[A-Za-z0-9_]{3,15}$"
            title="Use only A-Z, a-z, 0-9, _ and 3 >= symbol"
            required
            autofocus/>
        </li>
        <li class="password">
          <label for="password">Password</label>
          <input
            type="password"
            name="password"
            pattern="[A-Za-z0-9_]{3,15}$"
            title="Use only A-Z, a-z, 0-9, _ and 3 >= symbol"
            id="password"
            required
          />
        </li>
        <li>
          <button type="submit" class="submit button" > Log in</button>
        </li>
      </ul>
    </form>
  </div>
</template>
<script>
export default {
  name: 'Login'
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  div{
    width: 300px;
    margin-left: auto;
    margin-right: auto;
    padding-top: 2px;
    padding-left: 2px;
    padding-right: 20px;
    padding-bottom: 4px;
    background: #fff;
    border: 1px solid black;
  }
  label{
    text-align: left;
    font-style: italic;
    font-size: 20px;
    font-weight: 500;
    display: block;
    margin-left: 10px;
  }
  #username, #password{
    margin: 10px;
    margin-bottom: 30px;
  }
  input{
    width: 16em;
    height: 1.5em;
    font-size:16px;
    font-weight:bold;
    border: 1px solid #D4D4D4;
  }
  li {
    width: 230px;
    list-style-type: none; /* Убираем маркеры */
  }
  ul {
    margin-left: 0; /* Отступ слева в браузере IE и Opera */
    padding-left: 0; /* Отступ слева в браузере Firefox, Safari, Chrome */
  }
  button{
    color: #fff;
    font-size: 21px;
    width: 200px;
    height: 35px;
    background-color: orange;
    border: 1px solid orange;
    border-radius: 25px;
  }
</style>
