import logo from './logo.svg';
import './App.css';
import ProdutoNet from './view/ProdutoNet';
import ProdutoAltera from './view/ProdutoAltera';
import {Route,BrowserRouter as Router,Routes} from 'react-router-dom';

function App() {
  return (
<Router>
        <Routes>
          <Route exact path="/" element={<ProdutoNet/>}/>
          <Route path="/altera" element={<ProdutoAltera/>}/>
        </Routes>
</Router>
);

}

export default App;
