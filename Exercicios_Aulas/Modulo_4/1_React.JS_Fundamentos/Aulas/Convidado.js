import React, { Component } from 'react'

class Convidado extends Component {
   
    constructor(props) {
        super(props);
        this.state = { 
            convidado: props.convidado
        };

        this.handleClick = this.handleClick.bind(this);
      }
    
      handleClick() {
        alert('Código:' + this.state.convidado.codigo + '\nNome:' + this.state.convidado.nome);
      }

    render() {
        return(
            <li
                id={this.state.convidado.codigo}
                onClick={this.handleClick}
                >
                {this.state.convidado.nome}
            </li>        
        );
    }
}

export default Convidado
