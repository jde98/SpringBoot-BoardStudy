import axios from "axios";

export default {
    async getBoardList(context) {
        let res = await axios.get("http://localhost/board?postTitle=&createUser=");

        if (res.data.status === 202) {
            console.log(res.data.boardList)
            console.log(res.data.boardCount)
            context.commit("setBoard", {
                list : res.data.boardList,
                count : res.data.boardCount
            })
            // this.boardList = res.data.boardList;
            // this.boardCount = res.data.boardCount;
        }
    }
}