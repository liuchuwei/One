import { createApp } from 'vue'
import App from './App.vue'

// 1.router组件
import router from './router'

// 2.Element UI组件
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

// 3.Element icon组件
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

// 4.vite-plugin-svg-icons组件
import 'virtual:svg-icons-register'

// 5.store组件
import store from './store'

// 创建app
const app = createApp(App)
app.use(router)
app.use(store)
app.use(ElementPlus)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.mount('#app')