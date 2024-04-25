import {createStore} from 'vuex';

export default createStore({
    state: {
        isCollapsed: false,
    },
    mutations: {
        changeCollapsed(state) {
            state.isCollapsed = !state.isCollapsed;
        }
    }
})