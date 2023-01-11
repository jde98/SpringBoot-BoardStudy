import Vue from 'vue';
import Vuex from 'vuex';
import actions from "@/store/actions";
import mutations from "@/store/mutations";

Vue.use(Vuex);
export const store = new Vuex.Store({
    state : {
        title : "타이틀",
        list : [],
        count : 10
    },
    mutations,
    actions
})