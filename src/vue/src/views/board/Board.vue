<template>
  <div>
    {{this.title}}
    {{this.count}}
    <button @click="this.setTitle">test</button>
    <board-table v-if="this.count !== 0" :board-list="this.list" />
    <div v-if="this.count === 0">조회된 데이터가 없습니다.</div>
    <input type="text" v-model="inputText">
    <select v-model="selectVal">
      <option value="1">test</option>
      <option value="2">test2</option>
    </select>
  </div>
</template>

<script>

import BoardTable from '../../components/Table'
import {mapState} from 'vuex';

export default {
  name: 'boardList',
  components : {
    BoardTable
  },
  data () {
    return {
      inputText : "",
      selectVal : ""
    }
  },
  computed: {
    ...mapState(["title", "list", "count"])
  },
  mounted() {
    this.getBoardList();

    // setInterval(() => {
    //   console.log(this.inputText);
    //   console.log("selectVal", this.selectVal);
    // }, 1000);

  },
  methods : {
    async getBoardList() {
      await this.$store.dispatch("getBoardList");
    },
    setTitle() {
      this.$store.commit("setTitle", "정다은타이틀");
    }
  }
}
</script>
<style>
</style>
