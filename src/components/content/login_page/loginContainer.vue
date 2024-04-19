<template>
  <div class="login-container">
    <h1 class="login-title">账号密码登录</h1>
    <form @submit.prevent="login" class="login-form">
      <div class="form-group">
        <label for="username" class="form-label">用户名：</label>
        <br />
        <br />
        <input v-model="username" type="text" id="username" class="form-input" required />
      </div>
      <div class="form-group">
        <label for="password" class="form-label">密码：</label>
        <br />
        <br />
        <input v-model="password" type="password" id="password" class="form-input" required />
      </div>
      <button type="submit" class="login-button">登录</button>
    </form>
    <p v-if="errorMessage" class="error-message">{{ errorMessage }}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: '',
      errorMessage: ''
    };
  },
  methods: {
    login() {
      // 表单验证
      if (!this.username || !this.password) {
        this.errorMessage = '请填写完整的用户名和密码';
        return;
      }

      // 模拟登录过程
      if (this.username === 'admin' && this.password === 'password') {
        alert('登录成功！');
        // 在这里可以跳转到其他页面或执行其他操作
      } else {
        this.errorMessage = '用户名或密码错误';
      }
    }
  }
};
</script>

<style scoped>
.login-container {
  width: 304px;
  height: 370px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #f9f9f9;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.login-title {
  text-align: center;
  font-size: 20px;
  margin-top: 30px;
  margin-bottom: 30px;
  color: #333;
}

.login-form {
  display: flex;
  flex-direction: column;
}

.form-group {
  margin-bottom: 15px;
}

.form-label {
  font-weight: bold;
  color: #555;
  margin-left: 15px;
}

.form-input {
  width: 250px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 3px;
  margin-left: 15px;
}

.login-button {
  background-color: #007bff;
  color: #fff;
  border: none;
  padding: 10px 20px;
  border-radius: 3px;
  cursor: pointer;
  transition: background-color 0.3s ease;
  margin-left: 15px;
  margin-right: 15px;
  margin-top: 30px;
}

.login-button:hover {
  background-color: #0056b3;
}

.error-message {
  color: red;
  margin-top: 10px;
}
</style>
