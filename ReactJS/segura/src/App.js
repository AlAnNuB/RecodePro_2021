
import './App.css';
import Navbar from './Components/Layout/Navbar'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Home from './Components/Pages/Home'
import Destinos from './Components/Pages/Destinos'
import Promocao from './Components/Pages/Promocao'
import Contato from './Components/Pages/Contato'

function App() {
  return (
    

    <Router>
      <Navbar />
      <Routes>
          <Route exact path="/Home" element={<Home />} />
          <Route exact path="/Destinos" element={<Destinos />} />
          <Route exact path="/Promocao" element={<Promocao />} />
          <Route exact path="/Contato" element={<Contato />} />
      </Routes>

    </Router>

  );
}

export default App;
