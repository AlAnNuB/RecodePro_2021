import React from 'react';
import { Link } from 'react-router-dom'
import { useCart } from '../../Context/CarrinhoContext';

import AviaoColorido from '../IMG/Avião-Colorido-em-PNG.png'

function Navbar() {

const cart = useCart()
const itemsCount = Object.keys(cart.cart).length
  /* const itemsCount = Object.keys(cart.cart).reduce((prev, curr) => {
    return prev + cart.cart[curr].quantity
  },0) */

return (
<nav className="container-fluid navbar justify-content-center navbar-expand-sm bg-white shadow-sm">
  {/* <pre>{JSON.stringify(cart,null,2)}</pre> */}
  <ul className="navbar-nav ">
    <a className="navbar-brand" id="LogoHome"><Link to="/"><img src={AviaoColorido} alt="Home Logo" /></Link></a>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/">Página Principal</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Destinos">Destinos</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Promocao">Promoção</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Contato">Contato</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Carrinho">
        <i className="bi bi-cart3"> </i>
        Carrinho
        { itemsCount > 0 && <span>({itemsCount})</span>}
        </Link>
      </li>
  </ul>
</nav>

)
}
export default Navbar