import Alagoas from '../IMG/Alagoas.jpeg'
import Amazonas from '../IMG/Amazonas.jpeg'
import Ceara from '../IMG/Ceara.jpeg'
import Florianopolis from '../IMG/Florianopolis.jpeg'
import CardDesconto from '../Layout/CardDesconto'

function Promocao() {
  return (
    <main>

      <div class="container">
        <div class="row">
          <CardDesconto nome="Alagoas" img={Alagoas} ida="29/04/2022" desconto="3.470,00" preco="3.280,00" />
          <CardDesconto nome="Amazonas" img={Amazonas} ida="29/03/2022" desconto="4.470,00" preco="3.568,00" />
          <CardDesconto nome="Ceará" img={Ceara} ida="31/02/2022" desconto="8.753,00" preco="6.753,00" />
          <CardDesconto nome="Florianopolis" img={Florianopolis} ida="14/05/2022" desconto="3.953,00" preco="2.999,00" />
        </div>
      </div>

    </main>
  )
}

export default Promocao