import {useEffect, useState} from 'react'
import {Container, Row, Col, Button} from "react-bootstrap"

import {ProdutoTable}  from "./ProdutoTable"
import {ProdutoForm}   from './ProdutoForm'
import {obterProdutos, adicionarProduto} from "../net/service"

function ProdutoHome() {

    const [items, setItems] = useState([]);
    const [conectado, setConectado] = useState(false);
    const [insereVisivel, setInsereVisivel] = useState(false);

    useEffect(()=>{
        if(!conectado){
          setConectado(true);
          obterProdutos().then((retorno)=>setItems(retorno));
        }
    });

    const refreshData = () => {
        window.location.reload();
    }

    const handleInclui = () => {
        setInsereVisivel(true);
    }

    const execClose = () => {
        setInsereVisivel(false);
    }

    const execInclui = (codigo, nome, quantidade, descricao, ativo, cadastro) => {
        setInsereVisivel(false);
        adicionarProduto(nome,quantidade,descricao,ativo,cadastro).then(()=>refreshData());
    }

    return (
    <>
        <ProdutoForm show={insereVisivel}
                     alteracao={false}
                     codigo={0}
                     onClose={()=>execClose}
                     onPersist={execInclui}/>

        <Container fluid className="mt-2">
            <Row>
                <Col><h3>Cadastro de Produtos</h3></Col>
                <Col className="d-flex justify-content-end">
                    <Button onClick={handleInclui}>Incluir Produto</Button>
                </Col>
            </Row>
            <Row>
                <Col>
                    <ProdutoTable items={items} execRefresh={refreshData}/>
                </Col>
            </Row>
        </Container>
    </>
    );

}

export default ProdutoHome;