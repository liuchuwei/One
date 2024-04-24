<template>
  <h1>我是Home</h1>
  <h1 @click="logout">退出</h1>

</template>

<script>
  export default {
    name: "Home",
    components: {Hamburger},
    computed: {

    },
    methods: {
      logout: function(){
        this.$router.push('/login');
      },

    }
  }
</script>


<style scoped>

</style>