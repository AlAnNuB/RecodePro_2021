import {Route,BrowserRouter as Router,Routes} from 'react-router-dom'
import ProdutoHome from './view/ProdutoHome'

function App() {
  return (
    <Router>
        <Routes>
          <Route exact path="/" element={<ProdutoHome/>}/>
        </Routes>
    </Router>
  );
}

export default App;
