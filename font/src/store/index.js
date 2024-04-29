import {createStore} from 'vuex';
import user from './modules/user.js';

const store =createStore({
    state: {
        isCollapsed: false,
    },
    modules:{
        user
    },
    mutations: {
        // 侧边栏的展开
        changeCollapsed(state) {
            state.isCollapsed = !state.isCollapsed;
        }
    }
})

export default store