import React from 'react';
import logo from './logo.svg';
import './App.css';
import Convidado from './Convidado';

function App() {  /* Função de mesmo nome do Módulo */
  
  const convidados = [  /* Criação de uma lista com 2 posições */
    {codigo: 1007, nome:"Edmundo"},
    {codigo: 1009, nome:"Evair"},
    {codigo: 1012, nome:"Marcos"}
  ];

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Lista de convidados:
        </p>

        {convidados.map((convidado) =>  /* Comando para percorrer a lista, similar ao Foreach */
            <Convidado 
                key={convidado.codigo} 
                convidado={convidado}>              
            </Convidado>
        )}
        
      </header>
    </div>
  );
}

export default App;
