<template>

  <el-card class="login-form-layout">
    <el-form>
      <div style="text-align: center">
        <svg-icon name="dna" style="width: 56px;height: 56px;" color="#409EFF"></svg-icon>
        <h2 style="color: #409EFF">Login</h2>
      </div>

      <!--      1.用户名-->
      <el-form-item prop="username">
        <el-input style="width: 100%; height: 120%">

        </el-input>
      </el-form-item>

      <!--      2.密码-->
      <el-form-item prop="password">
        <el-input style="width: 100%; height: 120%">

        </el-input>
      </el-form-item>

      <br/>
      <!--      3.登录选项-->
      <el-form-item style="margin-bottom: 60px; text-align: center">
        <el-button style="width: 45%; height: 120%" type="primary" @click="login">登录</el-button>
        <el-button style="width: 50%; height: 120%" type="primary" @click="contact">联系作者</el-button>
      </el-form-item>
    </el-form>
  </el-card>
  <img :src="login_center_bg" class="login-center-layout">
  <el-dialog
      title="联系作者"
      v-model="dialogVisible"
      :center="true"
      width="30%"
  >
    <el-card class="contact-author">
      <span style="font-size: 18px; color: #303133;">微信:</span>
      <br/>
      <img src="../../assets/images/author.jpg" width="250" height="280" style="margin-top: 10px; margin-left: 30px">
      <br>
      <span style="font-size: 18px; color: #303133;">邮箱:</span>
      <br/>
      <code style="margin-top: 10px">
        <span style="font-size: 18px; color: #303133; ">liuchw3@mail2.sysu.edu.cn</span>
      </code>
    </el-card>

  </el-dialog>
</template>

<script>
  import SvgIcon from "@/components/SvgIcon/index.vue";
  import login_center_bg from '@/assets/images/login_center_bg.png'

  export default {
    name: 'login',
    data() {
      return{
        login_center_bg,
        dialogVisible:false
      }
    },
    components: {SvgIcon},
    methods:{
      login: function(){
        this.$router.push('/home');
      },
      contact: function(){
        this.dialogVisible = true
      }
    }
  }
</script>

<style scoped>
.login-form-layout {
  position: absolute;
  left: 0;
  right: 0;
  width: 360px;
  margin: 140px auto;
  border-top: 10px solid #409EFF;
}

.login-center-layout {
  background: #409EFF;
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
  margin-top: 200px;
}

.contact-author {
  left: 0;
  right: 0;
  width: 360px;
  margin: 10px auto
}

</style>