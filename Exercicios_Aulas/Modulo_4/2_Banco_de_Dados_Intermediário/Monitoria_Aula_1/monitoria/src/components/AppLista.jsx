import React from "react";
import Button from "./Button";
import Lista from "./Lista"

import './AppLista.css'

import { connect } from 'react-redux'

function entrar(){
    return{
        type: "ENTRAR",
        isLogged: true
    }
}

function sair(){
    return{
        type: "SAIR",
        isLogged: false
    }
}

function AppLista({ isLogged, dispatch }) {
    return (
        <div className="divAppLista">
            {isLogged ? <h1>Seja bem vindo</h1> : <h1>Entre para fazer sua lista</h1>}
            {isLogged ?
                <div>
                    <Button onClick={() => dispatch(sair())} className="logado">
                        Sair
                    </Button>
                    <Lista />
                </div>
                : <div>
                    <Button onClick={() => dispatch(entrar())} className="deslogado">
                        Entrar
                    </Button>
                </div>
            }
        </div>
    )
}


export default connect(state => ({isLogged: state.isLogged}))(AppLista)