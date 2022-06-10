import { add_todo, list_todos } from "./action_types";

export function addTodo(chave, novoTexto){
    return {type: add_todo, 
            payload: {key: chave, text: novoTexto} };
}

export function listTodos(){
    return {type: list_todos, 
            payload: {} };
}
