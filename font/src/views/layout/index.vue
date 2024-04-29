<template>

    <div class="container">

      <!--    1.侧边栏-->
      <SiderBar></SiderBar>

      <div class="content">
        <!--      2.导航栏-->
        <NaviBar></NaviBar>
        <!--      3.主体-->
        <router-view></router-view>
      </div>

    </div>

</template>

<script>

import SiderBar from './siderbar/index.vue'
import NaviBar from "./navibar/index.vue";

export default {
    name: "Layout",
    data() {
      return {
      }
    },
    components: {NaviBar, SiderBar},
    computed: {

    },

  }
</script>


<style scoped>
.container{
  display: flex;
  height: 100%;
}

.content{
  width: 100%;
}
</style>