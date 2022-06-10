import { useRef } from "react"

import './Lista.css'

import { connect } from 'react-redux';


function Lista({ lista, dispatch }){
    const input = useRef()

    function adicionar() {
        const value = input.current.value
        return {
            type: "ADICIONAR",
        }
    }



    return(
        <div className='Lista'>
            <h3>Adicionar Itemn na Lista</h3>
            <input type="text" placeholder="Digite um item para adicionar" ref={input}/>
            <button>Adicionar</button>
            <div className="divLista">
                <div className="title">
                    <h3>Lista de Compras</h3>
                </div>
                <ol>
                    {lista.map((item) => {
                        return <li>{item}</li>
                    })}
                </ol>
            </div>
        </div>
    )
}

export default connect(state => ({lista: state.list}))(Lista)