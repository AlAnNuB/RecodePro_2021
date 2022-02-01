import Alagoas from '../IMG/Alagoas.jpeg'
import Amazonas from '../IMG/Amazonas.jpeg'
import Ceara from '../IMG/Ceara.jpeg'
import Florianopolis from '../IMG/Florianopolis.jpeg'
import Goias from '../IMG/Goias.jpeg'
import MinasGerais from '../IMG/MinasGerais.jpeg'
import Paraiba from '../IMG/Paraiba.jpeg'
import Pernambuco from '../IMG/Pernambuco.jpeg'
import RioGrandeDoNorte from '../IMG/RioGrandeDoNorte.jpeg'
import RioGrandeDoSul from '../IMG/RioGrandeDoSul.jpeg'
import RioJaneiro from '../IMG/RioJaneiro.jpeg'
import Salvador from '../IMG/Salvador.jpeg'
import Tocantins from '../IMG/Tocantins.jpeg'

import Cards from '../Layout/Card'

function Destinos() {
  return (
    <main>

      <div class="container">
        <div class="row">
          <Cards nome="Alagoas" img={Alagoas} ida="29/04/2022" preco="3.280,00" />
          <Cards nome="Amazonas" img={Amazonas} ida="29/03/2022" preco="4.470,00" />
          <Cards nome="Ceará" img={Ceara} ida="25/02/2022" preco="8.753,00" />
          <Cards nome="Florianopolis" img={Florianopolis} ida="14/05/2022" preco="3.953,00" />
          <Cards nome="Goias" img={Goias} ida="29/04/2022" preco="5.370,00" />
          <Cards nome="Minas Gerais" img={MinasGerais} ida="26/10/2022" preco="9.470,00" />
          <Cards nome="Paraiba" img={Paraiba} ida="03/04/2022" preco="2.470,00" />
          <Cards nome="Pernambuco" img={Pernambuco} ida="05/12/2022" preco="4.693,00" />
          <Cards nome="Rio Grande do Norte" img={RioGrandeDoNorte} ida="05/11/2022" preco="5.853,00" />
          <Cards nome="Rio  Grande do Sul" img={RioGrandeDoSul} ida="30/10/2022" preco="6.824,00" />
          <Cards nome="Rio de Janeiro" img={RioJaneiro} ida="29/04/2022" preco="1.853,00" />
          <Cards nome="Salvador" img={Salvador} ida="15/06/2022" preco="5.268,00" />
          <Cards nome="Tocantins" img={Tocantins} ida="13/06/2022" preco="5.196,00" />
        </div>
      </div>
    </main>
  )
}

export default Destinos


