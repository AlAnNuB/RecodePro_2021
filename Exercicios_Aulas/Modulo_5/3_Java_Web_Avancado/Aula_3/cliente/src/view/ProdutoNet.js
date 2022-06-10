import {useEffect, useState} from 'react'
import {ProdutoList} from "./ProdutoList"
import {adicionarProduto, alterarProduto, excluirProduto, obterProdutos} from "../net/service"
import { useNavigate } from 'react-router-dom';

function ProdutoNet () {
   
    const navigate = useNavigate();

    const [items, setItems] = useState([]);
    const [nome, setNome] = useState('');
    const [quantidade, setQuantidade] = useState(0);
    const [codigo, setCodigo] = useState(0);
    const [conectado, setConectado] = useState(false);

    useEffect(()=>{
      if(!conectado){
        setConectado(true);
        obterProdutos().then((retorno)=>setItems(retorno));
      }
    });
    
    function handleNome(e) {
        setNome(e.target.value);
    }
    
    function handleQuantidade(e) {
      setQuantidade(e.target.value);
    }

    function handleCodigo(e) {
      setCodigo(e.target.value);
    }

    function handleSubmit(e) {
        e.preventDefault();
        if (nome.length === 0) {
          return;
        }
        adicionarProduto(nome,quantidade).then(
                 (retorno)=>{
                      console.log("Produto Adicionado: "+retorno.nome);
                      obterProdutos().then(
                          (listaProds)=>setItems(listaProds) 
                      )
                 });
                 
        setNome('');
    }

    function handleDelete(e) {
      e.preventDefault();
      excluirProduto(codigo).then(
               (retorno)=>
                    obterProdutos().then(
                        (retorno)=>setItems(retorno) 
                    ));
      setNome('');
    }

    function handleAlterar(e) {
      e.preventDefault();
      navigate("/altera",{ state: { id: codigo } });
    }
    

    return (
      <div>
        <h3>Produtos</h3>
        <ProdutoList items={items} />
        <form onSubmit={handleSubmit}>
          <label htmlFor="new-nome">
            Nome
          </label>
          <input
            id="new-nome"
            onChange={handleNome}
            value={nome}
          />
          <label htmlFor="new-qtd">
            Quantidade
          </label>
          <input
            id="new-qtd"
            onChange={handleQuantidade}
            value={quantidade}
          />
          <button>
            Adicionar
          </button>
        </form>
        <hr/>
        <form onSubmit={handleDelete}>
          <label htmlFor="new-codigo">
            Codigo do Produto:
          </label>
          <input
            id="new-codigo"
            onChange={handleCodigo}
            value={codigo}
          />
          <button>
            Remover
          </button>
        </form>
        <hr/>
        <form onSubmit={handleAlterar}>
          <label htmlFor="new-codigo">
            Codigo do Produto:
          </label>
          <input
            id="new-codigo"
            onChange={handleCodigo}
            value={codigo}
          />
          <button>
            Alterar
          </button>
        </form>
      </div>
    );
}

export default ProdutoNet;
