import {Route,BrowserRouter as Router,Routes,Link} from 'react-router-dom'
import ProdutoHome from './view/ProdutoHome'
import TelaInicial from './view/TelaInicial';

function App() {
  return (
    <Router>
      <div>
        <ul>
          <li><Link to="/">Home</Link></li>
          <li><Link to="/produtos">Cadastro de Produtos</Link></li>
        </ul>
        <hr />
        <Routes>
          <Route exact path="/" element={<TelaInicial/>}/>
          <Route path="/produtos" element={<ProdutoHome/>}/>
        </Routes>
        </div>
    </Router>
  );
}

export default App;
