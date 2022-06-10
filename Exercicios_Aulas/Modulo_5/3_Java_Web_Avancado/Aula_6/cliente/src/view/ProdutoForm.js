import React from "react"
import {Modal, Button, Form} from 'react-bootstrap'

import {obterProduto} from "../net/service"

export class ProdutoForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {nome: "", quantidade: 0, descricao: "", ativo: true, cadastro: this.converter(new Date())};
        this.preencherTela = this.preencherTela.bind(this);
        this.handleNome = this.handleNome.bind(this);
        this.handleQtd  = this.handleQtd.bind(this);
        this.handleCadastro  = this.handleCadastro.bind(this);
        this.handleDescricao = this.handleDescricao.bind(this);
        this.handleAtivo = this.handleAtivo.bind(this);
        this.persistir  = this.persistir.bind(this);
    }

    handleNome = (e) => { this.setState({nome: e.target.value}) }
    handleQtd  = (e) => { this.setState({quantidade: e.target.value}) }
    handleCadastro  = (e) => { this.setState({cadastro: e.target.value}) }
    handleDescricao = (e) => { this.setState({descricao: e.target.value}) }
    handleAtivo  = (e) => { this.setState({ativo: e.target.checked}) }

    persistir = () => {
        this.props.onPersist(this.props.codigo,this.state.nome,this.state.quantidade,
                             this.state.descricao,this.state.ativo, this.state.cadastro);
    }

    converter = (dataISO) => {
        console.log(dataISO);
        var data = new Date(dataISO);
        var d = data.getDate(), m = data.getMonth() + 1, a = data.getFullYear();
        var dataStr = a+"-"+((m<10)?"0":"")+m+"-"+((d<10)?"0":"")+d;
        console.log(dataStr);
        return dataStr;
    }

    preencherTela = () => {
        if(this.props.alteracao) {
            obterProduto(this.props.codigo).then((retorno)=>{
                console.log(retorno);
                this.setState({nome: retorno.nome, 
                               quantidade: retorno.quantidade,
                               descricao: retorno.descricao,
                               ativo: retorno.ativo,
                               cadastro: this.converter(retorno.cadastro)});
            })
        } else
            this.setState({nome: "", quantidade: 0, descricao: "", ativo: true, cadastro: this.converter(new Date())});
    }

    render() {
        return(
        <Modal show={this.props.show} onHide={this.props.onClose()}
                                      onEntering={this.preencherTela}>
            <Modal.Header closeButton>
                <Modal.Title>{this.props.alteracao ? "Alteração" : "Inclusão"}</Modal.Title>
            </Modal.Header>
            <Modal.Body>
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

                <Form.Group className="mb-3">
                    <Form.Label>Cadastro</Form.Label>
                    <Form.Control type="date" value={this.state.cadastro} onChange={this.handleCadastro} />
                </Form.Group>

                <Form.Group className="mb-3">
                    <Form.Label>Descrição</Form.Label>
                    <Form.Control as="textarea" rows={3} 
                                  placeholder="Digite algo sobre o produto..."  
                                  value={this.state.descricao}
                                  onChange={this.handleDescricao}/>
                </Form.Group>
                <Form.Group className="mb-3">
                    <Form.Check type="switch" 
                            checked={this.state.ativo}
                            onChange={this.handleAtivo}
                            label={this.state.ativo?"Produto Ativo":"Produto Inativo"}/>
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