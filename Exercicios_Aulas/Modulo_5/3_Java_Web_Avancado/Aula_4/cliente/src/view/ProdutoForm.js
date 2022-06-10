import React from "react"
import {Modal, Button, Form} from 'react-bootstrap'

import {obterProduto} from "../net/service"

export class ProdutoForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {nome: "", quantidade: 0};
        this.preencherTela = this.preencherTela.bind(this);
        this.handleNome = this.handleNome.bind(this);
        this.handleQtd  = this.handleQtd.bind(this);
        this.persistir  = this.persistir.bind(this);
    }

    handleNome = (e) => { this.setState({nome: e.target.value}) }
    handleQtd  = (e) => { this.setState({quantidade: e.target.value}) }

    persistir = () => {
        this.props.onPersist(this.props.codigo,this.state.nome,this.state.quantidade);
    }

    preencherTela = () => {
        if(this.props.alteracao) {
            obterProduto(this.props.codigo).then((retorno)=>{
                console.log(retorno);
                this.setState({nome: retorno.nome, 
                               quantidade: retorno.quantidade});
            })
        } else
            this.setState({nome: "", quantidade: 0});
    }

    render() {
        return(
        <Modal show={this.props.show} onHide={this.props.onClose()}
                                      onEntering={this.preencherTela}>
            <Modal.Header closeButton>
                <Modal.Title>{this.props.alteracao ? "Alteração" : "Inclusão"}</Modal.Title>
            </Modal.Header>
            <Modal.Body>
                Nome: {this.state.nome} Quantidade: {this.state.quantidade}
                <Form>
                <Form.Group className="mb-3">
                    <Form.Label>Nome</Form.Label>
                    <Form.Control type="text" placeholder="Nome do Produto" 
                                  value={this.state.nome}
                                  onChange={this.handleNome}/>
                </Form.Group>
                <Form.Group className="mb-3">
                    <Form.Label>Quantidade</Form.Label>
                    <Form.Control type="text" value={this.state.quantidade}
                                  onChange={this.handleQtd}/>
                </Form.Group>
                </Form>
            </Modal.Body>
            <Modal.Footer>
                <Button variant="primary" onClick={this.persistir}>
                    Confirmar
                </Button>
                <Button variant="secondary" onClick={this.props.onClose()}>
                    Cancelar
                </Button>
            </Modal.Footer>                
        </Modal>
      );
    }
} 