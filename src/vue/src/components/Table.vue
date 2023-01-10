<template>
  <table>
    <thead>
      <tr>
        <th>no</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(board, index) in boardList" :key="index">
        <td>{{ index + 1 }}</td>
        <td>{{ board.postTitle }}</td>
        <td>{{ board.createUser }}</td>
        <td>{{ board.createDate }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "boardTable",
  props : {
    boardList : Array
  }
}
</script>

<style scoped>

</style>