import logo from './logo.svg';
import './App.css';
import Primeiro from './Components/Primeiro';
import Relorio from './Components/Relogio';
import AppLista from './Components/AppLista'

function App() {
  return (
    <div className="App">
     <Primeiro /> 
     <br />
     <Relorio />
     <br />
     <AppLista />
    </div>
  );
}

export default App;
