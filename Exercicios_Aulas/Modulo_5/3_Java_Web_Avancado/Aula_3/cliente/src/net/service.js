import api from "./conector";

export const obterProdutos = async() => {
    return (await api.get("/produtos")).data;
}

export const obterProduto = async(codigo) => {
    return (await api.get("/produtos/"+codigo)).data;    
}

export const alterarProduto = async(codigo, nome,quantidade) => {
    var dados = {id: codigo, nome:nome, quantidade:quantidade, ativo:true};
    console.log(dados);
    await api.put("/produtos",dados);
}

export const adicionarProduto = async(nome,quantidade) => {
    var dados = {nome:nome, quantidade:quantidade, ativo:true};
    console.log(dados);
    return (await api.post("/produtos",dados)).data;
}

export const excluirProduto = async(codigo) => {
    await api.delete("/produtos/"+codigo);
}


