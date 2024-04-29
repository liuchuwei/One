<template>
  <div class="home">
    <h1>我是首页</h1>
    <el-button style="width: 45%; height: 120%" type="primary" @click="handleLogin" :loading="loading">登录</el-button>
  </div>
</template>

<script>
export default {
  name: "Home",
  methods:{
    handleLogin: function(){

      this.$router.push('/layout');

    },
  }
}
</script>

<style scoped>

</style>