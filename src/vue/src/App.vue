<template>
  <div id="app">
    <router-link to="/">main</router-link>
    <router-link to="/login">info</router-link>
    <!-- convert -->
    <!-- <a href="#/main" class="">main</a> -->
    <router-view></router-view>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {

  }
}
</script>

<style>
</style>
