<template>
  <div :class="{ 'FoldBar': $store.state.isCollapsed, 'ExpandBar': !$store.state.isCollapsed }">

    <!--    1.头部-->
    <div :class="{ 'FoldHeader': $store.state.isCollapsed, 'ExpandHeader': !$store.state.isCollapsed }">

      <el-avatar style="width: 90px; height: 90px; box-shadow: 0px 0px 5px 5px whitesmoke" src="src/assets/images/avatar.jpg"/>
      <h2>Wei</h2>
      <h4 style="font-style: italic; color: gray">在云端，才不会有乌云密布</h4>

    </div>

    <!--    2.主要内容-->
    <el-menu class="slide_menu" :collapse=$store.state.isCollapsed>

      <el-menu-item>
        <el-icon><location /></el-icon>
        <span>Navigator One</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><location /></el-icon>
        <span>Navigator One</span>
      </el-menu-item>

      <el-menu-item>
        <el-icon><location /></el-icon>
        <span>Navigator One</span>
      </el-menu-item>


      <el-menu-item>
        <el-icon><location /></el-icon>
        <span>Navigator One</span>
      </el-menu-item>

    </el-menu>

    <!--    3.底部图片-->
    <img src="@/assets/images/slide_bear.png">



  </div>
</template>

<script>
  export default {
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
    margin-top: 40px;
    margin-left: 30px;
}


</style>