import logo from './logo.svg';
import './App.css';
import Header from './Header';
import { useState } from 'react';



function App() { // função ou método
   const [contador, setContador] = useState(0);

   function clicando() {
    setContador(contador+1);
   }

  return (
    <div className="App">
      <Header title={contador} />
      <input type="button" value="Clique em sá bagaça" onClick={clicando} />
    </div>
  );
}

export default App;
