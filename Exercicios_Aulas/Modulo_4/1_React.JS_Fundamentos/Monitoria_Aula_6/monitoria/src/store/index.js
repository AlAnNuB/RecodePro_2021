import { createStore } from "redux";

const initialState = {
  isLogged: false,
  list: ["abobora", "abacaxi"]
}

function list(state = initialState, action) {
  if (action.type === "ENTRAR") {
    return {...state, isLogged: action.isLogged}
  } else if (action.type === "SAIR") {
    return {...state, isLogged: action.isLogged}
  }
  return state
}

const store = createStore(list)

export default store
