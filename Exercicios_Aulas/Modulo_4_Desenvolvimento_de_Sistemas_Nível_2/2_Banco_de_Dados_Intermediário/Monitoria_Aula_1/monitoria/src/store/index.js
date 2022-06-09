import { createStore } from "redux";

const initialState = {
    isLogged: false,
    list: []
}

function list(state = initialState, action){
    if(action.type === "ENTRAR"){
        return {...state, isLogged: action.isLogged}
    }else if(action.type === "SAIR"){
        return {...state, isLogged: action.isLogged}
    }else if(action.type === "ADICIONAR"){
        if(action.value == ""){
            alert("Digite algo para adicionar")
            return state
        }
        return {...state, list:[...state.list, action.value]}
    }
    return state
}

const store = createStore(list)

export default store