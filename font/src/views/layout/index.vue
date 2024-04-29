<template>

    <div class="container">

      <!--    1.侧边栏-->
      <SiderBar></SiderBar>

      <div class="body">

        <div class="navigator">
          <!--      2.导航栏-->
          <NaviBar></NaviBar>
        </div>

        <!--      3.主体-->
        <div class="content">
          <router-view></router-view>
        </div>

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

.body{
  width: 100%;
}
.navigator{
  margin-left: 20px;
}

.content{
  margin-top: 35px;
  margin-left: 35px;
}

</style>