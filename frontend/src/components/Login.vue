<template>
  <div class="login">
    <form action="" method="POST">
      <p>Input your Login: <input type = "text" id = "Login"/></p>
      <p>Input your Password: <input type = "text" id = "Password"/></p>
      <button type = "submit">
        <img src = "https://cs.pikabu.ru/post_img/2013/06/03/0/1370204436_2065417852.gif">
      </button>
    </form>
  </div>
</template>
<script>
export default {
  name: 'Login',
  data () {
    return {
      msg: 'Come in my classroom'
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  p{
    color : revert;
    text-align: left;
  }
</style>
