<template>
  <div>
    <board-table v-if="boardCount !== 0" :board-list="boardList" />
    <div v-if="boardCount === 0">조회된 데이터가 없습니다.</div>
    <input type="text" v-model="inputText">
    <select v-model="selectVal">
      <option value="1">test</option>
      <option value="2">test2</option>
    </select>
  </div>
</template>

<script>

import axios from 'axios';
import BoardTable from '../../components/Table'

export default {
  name: 'boardList',
  components : {
    BoardTable
  },
  data () {
    return {
      boardList : [],
      boardCount : 0,
      inputText : "",
      selectVal : ""
    }
  },
  mounted() {
    this.getBoardList();

    setInterval(() => {
      console.log(this.inputText);
      console.log("selectVal", this.selectVal);
    }, 1000);

  },
  methods : {
    async getBoardList() {
      let res = await axios.get("http://localhost/board?postTitle=&createUser=");

      if (res.data.status === 202) {
        console.log(res.data.boardList)
        console.log(res.data.boardCount)
        this.boardList = res.data.boardList;
        this.boardCount = res.data.boardCount;
      }
    }
  }
}
</script>
<style>
</style>
