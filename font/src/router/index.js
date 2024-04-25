import { createRouter,createWebHashHistory } from "vue-router"

// 1.导入组件
import Layout from '@/views/layout/index.vue'
import Login from '@/views/login/index.vue'
import Home from '@/views/home/index.vue'

// 2.定义路径
const routes = [
    {path:'/', component:Login},
    {path:'/login', component:Login},
    {   path:'/layout',
        component:Layout,
        children:[
            {path:'', component:Home},
            {path:'/home', component:Home},
        ]

    },
]

// 3.创建实例
const router = createRouter({
    history:createWebHashHistory(),
    routes
})

// 4.导出实例
export default router