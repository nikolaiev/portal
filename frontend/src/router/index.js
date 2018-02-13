import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/routes/HelloWorld'
import Login from '@/components/routes/Login'
import News from '@/components/routes/News/News'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'News',
      component: News,
      title: 'Home',
      showMenu: true.valueOf()
    },
    {
      path: '/hello',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/login',
      name: 'Login',
      component: Login,
      title: 'Login',
      showMenu: true
    }
  ]
})
