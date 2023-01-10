import Vue from 'vue';
import Router from 'vue-router';
import MainApp from '../App';
import BoardList from '../views/board/Board';
import Login from '../views/common/Login';
import Register from '../views/common/Register';

Vue.use(Router); // vue 라우터 사용

export default new Router({
    mode: 'history', // history 모드를 사용할시 url에 #이 들어가지 않습니다.
    routes:[
        {
            path:'/'
            ,component:MainApp
        },
        {
            path:'/login'
            ,component:Login
        },
        {
            path:'/register'
            ,component:Register
        },
        {
            path:'/board'
            ,component:BoardList
        }
    ]
})