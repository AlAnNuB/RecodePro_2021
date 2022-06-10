import {Buffer} from 'buffer';
import api from "./conector";

var token = ''

export const setToken = (username, password) => {
    token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64')
}

export const adicionarUsuario = async(username, password) =>{
    var dados = {id: 0, username:username, password:password, role: "ROLE_USER"};
    return (await api.post("/user",dados)).data;
}

export const obterProdutos = async() => {
    return (await api.get("/produtos",{
        headers: {
            "Authorization": `Basic ${token}`
        }
    })).data;
}

export const obterProduto = async(codigo) => {
    return (await api.get("/produtos/"+codigo,{
        headers: {
            "Authorization": `Basic ${token}`
        }
    })).data;    
}

export const alterarProduto = async(codigo, nome, quantidade, descricao, ativo, cadastro) => {
    var dados = {id: codigo, nome:nome, quantidade:quantidade, descricao: descricao, ativo:ativo, cadastro: cadastro};
    await api.put("/produtos",dados,{
        headers: {
            "Authorization": `Basic ${token}`
        }
    });
}

export const adicionarProduto = async(nome,quantidade, descricao, ativo, cadastro) => {
    var dados = {nome:nome, quantidade:quantidade, descricao: descricao, ativo:ativo, cadastro: cadastro};
    return (await api.post("/produtos",dados,{
        headers: {
            "Authorization": `Basic ${token}`
        }
    })).data;
}

export const excluirProduto = async(codigo) => {
    await api.delete("/produtos/"+codigo,{
        headers: {
            "Authorization": `Basic ${token}`
        }
    });
}


