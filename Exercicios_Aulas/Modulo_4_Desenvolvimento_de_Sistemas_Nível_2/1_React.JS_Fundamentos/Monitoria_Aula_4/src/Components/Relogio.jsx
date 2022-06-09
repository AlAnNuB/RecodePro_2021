import React, { Component } from "react";

export default class Relorio extends Component {

  constructor() {
    super()
    this.state = {
      data: new Date()
    }
  }

  componentDidMount() {
    this.atualizarHora()
  }

  atualizarHora() {
    setInterval(() => {
      this.setState({
        data: new Date()
      }) 
    }, 1000);
  }

  render() {
    return(
      <div className="principal">
        <div className="quadrado"> {this.state.data.getHours()}H </div>
        <div className="quadrado"> {this.state.data.getMinutes()}M </div>
        <div className="quadrado"> {this.state.data.getSeconds()}S </div>
      </div>
    )
  }

}