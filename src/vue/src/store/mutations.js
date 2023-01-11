export default {
    setTitle(state, title) {
        state.title = title;
    },
    setList(state, list) {
        state.list = list;
    },
    setCount(state, count) {
        state.count = count;
    },
    setBoard(state, board) {
        state.list = board.list;
        state.count = board.count;
    }
}