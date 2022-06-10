import React from "react"
import {Table, Button} from 'react-bootstrap'

import {ProdutoExcluir} from './ProdutoExcluir'
import {ProdutoForm}    from "./ProdutoForm"
import {excluirProduto, alterarProduto} from '../net/service'

export class ProdutoTable extends React.Component {

    constructor(props) {
        super(props);
        this.state = {codigo: 0, excluirVisivel: false, formVisivel: false};
        this.handleDelete = this.handleDelete.bind(this);
        this.handleAltera = this.handleAltera.bind(this);
        this.execClose = this.execClose.bind(this);
        this.execDelete = this.execDelete.bind(this);
    }

    handleDelete = (codigo) => {
        this.setState({codigo: codigo, excluirVisivel:true});
    }

    handleAltera = (codigo) => {
        this.setState({codigo: codigo, formVisivel:true});
    }

    execClose = () => {
        this.setState({excluirVisivel:false, formVisivel: false});
    }

    execDelete = () => {
        this.setState({excluirVisivel:false});
        excluirProduto(this.state.codigo).then(
            () => this.props.execRefresh() // Vem da ProdutoHome
        ) 
    }

    execAltera = (codigo, nome, quantidade) => {
        this.setState({formVisivel:false});
        alterarProduto(codigo,nome,quantidade).then(this.props.execRefresh());
    }

    render() {
        return(
        <>
            <ProdutoExcluir show={this.state.excluirVisivel}
                            codigo={this.state.codigo}
                            onClose={()=>this.execClose}
                            onDelete={()=>this.execDelete}/>

            <ProdutoForm show={this.state.formVisivel}
                         alteracao={true}
                         codigo={this.state.codigo}
                         onClose={()=>this.execClose}
                         onPersist={this.execAltera}/>


            <Table striped bordered hover size="sm">
            <thead>
                <tr>
                <th>#</th>
                <th>Nome</th>
                <th>Quantidade</th>
                <th>Opções</th>
                </tr>
            </thead>
            <tbody>
            {this.props.items.map(item => (
                <tr key={item.id}>
                <th>{item.id}</th>
                <th>{item.nome}</th>
                <th>{item.quantidade}</th>
                <th>
                    <Button onClick={()=>this.handleAltera(item.id)}>
                        Alterar</Button>{' '}
                    <Button onClick={()=>this.handleDelete(item.id)} variant="danger">
                        Excluir</Button>
                </th>
                </tr>
            ))}
            </tbody>
            </Table>
        </>    
        );
    }
}