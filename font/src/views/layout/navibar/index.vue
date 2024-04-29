<template>

  <div class="home-header">
    <!--        1.折叠展开-->
<!--    <el-icon class="home-EF" @click='change_ef'>-->
<!--      <Expand v-if="$store.state.isCollapsed"></Expand>-->
<!--      <Fold v-if="!$store.state.isCollapsed"></Fold>-->
<!--    </el-icon>-->

    <!--        2.面包屑-->
    <el-breadcrumb separator="/">
      <el-breadcrumb-item v-for="(item,index) in breadList" :key="index">{{item}}
      </el-breadcrumb-item>
    </el-breadcrumb>

    <!--        3.下拉菜单-->
<!--    <el-dropdown class="el-dropdown-link">-->
<!--      <div class="el-dropdown-item">-->
<!--      <el-avatar><img src="@/assets/images/avatar.jpg"></el-avatar>-->
<!--      <el-icon><arrow-down /></el-icon>-->
<!--      </div>-->

<!--      <template #dropdown>-->
<!--        <el-dropdown-menu>-->
<!--          <el-dropdown-item>首页</el-dropdown-item>-->
<!--          <el-dropdown-item @click="logout">退出</el-dropdown-item>-->
<!--        </el-dropdown-menu>-->
<!--      </template>-->
<!--    </el-dropdown>-->

  </div>

</template>

<script>
  export default {
    name: "Navibar",
    data(){
    },
    methods: {
      logout: function(){
        this.$router.push('/home');

      },
      change_ef: function(){
        this.$store.commit('changeCollapsed');
      }
    },
    computed(){
    }
  }
</script>

<style scoped>
.home-header {
  display: flex;
  align-items: center;
  height: 66px;

  .home-EF{
    margin-right: 17px;
    margin-left: 17px
  }

  .el-dropdown-link{
    margin-left: auto;

    .el-dropdown-item{
      display: flex;
      align-items: center;
      justify-content: center;
    }
  }

}
</style>