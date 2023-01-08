import Vue from 'vue';
import Router from 'vue-router';
import Home from '@/components/Home'
import Create from '@/components/Create'
import Table from '@/components/Table'

Vue.use(Router);

export default new Router({
    mode:'history',
    routes:[
        {
            path:'/',
            component:Home
        },
        {
            path:'/table',
            component:Table
        },
        {
            path:'/create',
            component:Create
        }
    ]
})