<template>

  <el-container class="layout-container-demo" style="height: 500px">

    <!--    1.侧边栏-->
    <SiderBar style="height: 200%"></SiderBar>

    <el-container style="flex-direction: column">
      <!--      2.导航栏-->
      <NaviBar></NaviBar>
      <!--      3.主体-->
      <el-main style="height: 100%">
        <el-scrollbar>
          <router-view></router-view>
        </el-scrollbar>
      </el-main>

    </el-container>

  </el-container>

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

</style>