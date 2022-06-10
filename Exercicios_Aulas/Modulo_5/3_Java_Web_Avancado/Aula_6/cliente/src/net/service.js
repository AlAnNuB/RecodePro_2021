import api from "./conector";

export const obterProdutos = async() => {
    return (await api.get("/produtos")).data;
}

export const obterProduto = async(codigo) => {
    return (await api.get("/produtos/"+codigo)).data;    
}

export const alterarProduto = async(codigo, nome, quantidade, descricao, ativo, cadastro) => {
    var dados = {id: codigo, nome:nome, quantidade:quantidade, descricao: descricao, ativo:ativo, cadastro: cadastro};
    await api.put("/produtos",dados);
}

export const adicionarProduto = async(nome,quantidade, descricao, ativo, cadastro) => {
    var dados = {nome:nome, quantidade:quantidade, descricao: descricao, ativo:ativo, cadastro: cadastro};
    return (await api.post("/produtos",dados)).data;
}

export const excluirProduto = async(codigo) => {
    await api.delete("/produtos/"+codigo);
}


