<template>
  <div :class="{ 'FoldBar': $store.state.isCollapsed, 'ExpandBar': !$store.state.isCollapsed }">

    <!--    1.头部-->
    <div :class="{ 'FoldHeader': $store.state.isCollapsed, 'ExpandHeader': !$store.state.isCollapsed }">

      <el-avatar class="my_avatar" src="src/assets/images/avatar.jpg"/>
      <h2>Wei</h2>
      <h4 style="font-style: italic; color: gray">
        no dark shadows loom <br> above the clouds
      </h4>

    </div>

    <!--    2.主要内容-->
    <el-menu class="slide_menu" :collapse=$store.state.isCollapsed>

      <el-menu-item>
        <el-icon><house /></el-icon>
        <span>Home</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><Document /></el-icon>
        <span>News</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><coffee /></el-icon>
        <span>Careers</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><clock /></el-icon>
        <span>Times</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><files /></el-icon>
        <span>Archive</span>
      </el-menu-item>



    </el-menu>

    <!--    3.底部图片-->
    <img src="@/assets/images/slide_bear.png">



  </div>
</template>

<script>
import {Clock, Coffee, Document, Files, House} from "@element-plus/icons-vue";

  export default {
    components: {Files, Clock, Coffee, Document, House},
    data() {
      return {
      }
    }
  }
</script>

<style scoped>

.FoldBar{
  width: 45px;
  background-color: white;
  img {
    width: 260px;
    position: absolute;
    bottom: 20px;
    left: 50px;
  }
}

.ExpandBar{
  width: 300px;
  img {
    width: 260px;
    position: absolute;
    bottom: 20px;
  }
  background: linear-gradient(to bottom, white, wheat);
}

.ExpandHeader{
  text-align: center;
  margin-top: 30px;
}

.FoldHeader{
  display: none;
}


.slide_menu{
  background-color: transparent;
  margin-top: 240px;
}

.slide_menu:not(.el-menu--collapse){

    background-color: transparent;
    margin-top: 0;
    margin-left: 55px;
}

.my_avatar{
  width: 90px;
  height: 90px;
  box-shadow: 0px 0px 5px 5px whitesmoke
}

</style>