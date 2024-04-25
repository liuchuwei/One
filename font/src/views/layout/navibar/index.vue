<template>

  <el-header class="home-header">
    <!--        1.折叠展开-->
    <el-icon class="home-EF" @click='change_ef'>
      <Expand v-if="$store.state.isCollapsed"></Expand>
      <Fold v-if="!$store.state.isCollapsed"></Fold>
    </el-icon>

    <!--        2.面包屑-->
    <el-breadcrumb :separator-icon="ArrowRight">
      <el-breadcrumb-item :to="{ path: '/' }">homepage</el-breadcrumb-item>
      <el-breadcrumb-item>promotion management</el-breadcrumb-item>
      <el-breadcrumb-item>promotion list</el-breadcrumb-item>
      <el-breadcrumb-item>promotion detail</el-breadcrumb-item>
    </el-breadcrumb>

    <!--        3.下拉菜单-->
    <el-dropdown class="el-dropdown-link">
      <div class="el-dropdown-item">
      <el-avatar><img src="@/assets/images/avatar.jpg"></el-avatar>
      <el-icon><arrow-down /></el-icon>
      </div>

      <template #dropdown>
        <el-dropdown-menu>
          <el-dropdown-item>首页</el-dropdown-item>
          <el-dropdown-item @click="logout">退出</el-dropdown-item>
        </el-dropdown-menu>
      </template>
    </el-dropdown>

  </el-header>

</template>

<script>
  export default {
    name: "Navibar",
    methods: {
      logout: function(){
        this.$router.push('/login');

      },
      change_ef: function(){
        this.$store.commit('changeCollapsed');
      }
    }
  }
</script>

<style scoped>
.home-header {
  display: flex;
  align-items: center;
  background-color: whitesmoke;
  .home-EF{
    margin-right: 17px;
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