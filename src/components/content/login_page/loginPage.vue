<template>
  <div class="login-page">
    <div class="backgroudimg">
      <img src="@/assets/img/login/background.png" width="400">
    </div>
    <div class="loginContainer"><login-container/></div>
  </div>>
</template>

<script >
  import loginContainer from "@/components/content/login_page/loginContainer.vue";
  export default {
    name: 'loginPage',
    components: {
      loginContainer
    }
  }
</script>

<style>
  body{
    background-color: #FFF6E9;
  }

  .login-container{
    position:relative;
    left:340px;
    top:150px
  }

  .backgroudimg{
    position:relative;
    left:340px;
    top:150px;
    float: left;
  }
</style>

