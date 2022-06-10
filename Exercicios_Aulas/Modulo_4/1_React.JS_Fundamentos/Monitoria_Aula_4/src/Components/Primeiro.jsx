import React, { Component } from "react";

export default class Primeiro extends React.Component {

 constructor(props) {
  super(props)
  this.state = {
    nome: "Alan",
    idade: 25
  }
  this.mudarTexto = this.mudarTexto.bind(this)
  this.redefinirTexto = this.redefinirTexto.bind(this)
}

mudarTexto() {
  this.setState({
      nome: "Alanzinho",
      idade: 23
  })
}

redefinirTexto() {
  this.setState({
    nome: "Alan",
    idade: 25
  })
}

render() {
  return(
    <div>
      <div>Olá { this.props.nome } { this.props.idade } </div> <br />
      <div>Olá { this.state.nome } {this.state.idade} </div> <br />
      <div><button onClick={this.mudarTexto}>Mudar Nome</button></div> <br />
      <div><button onClick={this.redefinirTexto}>Redefinir Nome</button></div> <br />
    </div>
  )
}

}