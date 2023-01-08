<template>
  <v-app-bar dark dense>
    <ul class="menu">
      <li>
        <v-btn @click="toHome">
          HOME
        </v-btn>
      </li>
      <li>
        <v-btn
            @click="toPage1"
        >
          PAGE1
        </v-btn>
      </li>
      <li>
        <v-btn @click="toPage2">
          PAGE2
        </v-btn>
      </li>
    </ul>
  </v-app-bar>
</template>

<script>
export default {
  name: 'CoreAppBar',
  methods:{
    toHome() {
      alert('HOME')
    },
    toPage1(){
      alert('PAGE1')
    },
    toPage2(){
      alert('PAGE2')
    }
  }
}
</script>

<style>
ul.menu li{ display: inline;}
</style>