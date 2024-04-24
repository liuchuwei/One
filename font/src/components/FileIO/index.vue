<script setup>

</script>

<template>
  <h1>文件上传下载</h1>
  <el-upload class="upload-demo" drag action="http://localhost:8080/upload"
             multiple="true">
    <i class="el-icon-upload"></i>
    <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
    <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>
  </el-upload>
</template>

<style scoped>

</style>