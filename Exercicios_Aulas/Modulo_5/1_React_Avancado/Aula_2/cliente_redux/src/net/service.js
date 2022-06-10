import api from "./conector";

export const obterTodos = async() => {
    return (await api.get("/listar")).data;
}

export const adicionarTodo = async(novaChave,novoTexto) => {
    var dados = {key:novaChave, text:novoTexto};
    console.log(dados);
    return (await api.post("/addTodo",dados)).data;
}

