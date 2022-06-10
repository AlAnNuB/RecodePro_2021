import React from 'react';
import logo from './logo.svg';
import './App.css';
import Convidado from './Convidado';

function App() {
  
  const convidados = [
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

        {convidados.map((convidado) =>
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
