import api from "./conector";

export const obterProdutos = async() => {
    return (await api.get("/produtos")).data;
}

export const adicionarProduto = async(nome,quantidade) => {
    var dados = {nome:nome, quantidade:quantidade, ativo:true};
    console.log(dados);
    return (await api.post("/produtos",dados)).data;
}

export const excluirProduto = async(codigo) => {
    await api.delete("/produtos/"+codigo);
}


