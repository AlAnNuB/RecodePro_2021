import { add_todo } from "./action_types";

const estadoGlobal = {
    todos: []
};

function rootReducer(state = estadoGlobal, action){
    if(action.type === add_todo){
        state.todos.push(action.payload);
    }
    return state;
}

export default rootReducer;

