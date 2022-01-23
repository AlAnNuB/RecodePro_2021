import { Link } from 'react-router-dom'

import AviaoColorido from '../IMG/Avião-Colorido-em-PNG.png'
function Navbar() {
  
return (

<nav className="container-fluid navbar justify-content-center navbar-expand-sm bg-white shadow-sm">
  <ul className="navbar-nav ">
    <a className="navbar-brand" id="LogoHome"><Link to="/Home"><img src={AviaoColorido} alt="Home Logo" /></Link></a>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Home">Página Principal</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Destinos">Destinos</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Promocao">Promoção</Link></li>
      <li className="nav-item m-2"><Link className="nav-link btn btn-lg btn-outline-primary" to="/Contato">Contato</Link></li>
  </ul>
</nav>

)
}
export default Navbar