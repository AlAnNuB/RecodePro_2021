
import './App.css';
import Navbar from './Components/Layout/Navbar'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Home from './Components/Pages/Home'
import Destinos from './Components/Pages/Destinos'
import Promocao from './Components/Pages/Promocao'
import Contato from './Components/Pages/Contato'
import Footer from './Components/Layout/Footer'
import Carrinho from './Components/Pages/Carrinho'

function App() {
  return (
    

    <Router>
      <Navbar />
      <Routes>
          <Route exact path="/" element={<Home />} />
          <Route path="/Destinos" element={<Destinos />} />
          <Route path="/Promocao" element={<Promocao />} />
          <Route path="/Contato" element={<Contato />} />
          <Route path="/Carrinho" element={<Carrinho />} />
      </Routes>
      <Footer />
    </Router>

  );
}

export default App;
