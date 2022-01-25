import Alagoas from '../IMG/Alagoas.jpeg'
import Amazonas from '../IMG/Amazonas.jpeg'
import Ceara from '../IMG/Ceara.jpeg'
import Florianopolis from '../IMG/Florianopolis.jpeg'

function Promocao() {
  return (
    <main>

      <div class="container">
        <div class="row">
          <div class="col-12 col-md-6 col-lg-4 col-xl-3">
            <div class="card destinos m-2 p-0">
              <img src={Alagoas} class="card-img-top h-60 m-0 p-0" alt="Alagoas" />
                <div class="card-body">
                  <h4 class="card-title">Alagoas</h4>
                  <p class="card-text small m-0">Ida: 29/04/2022</p>
                  <p class="card-text small m-0">De: R$ 3.470,00</p>
                  <p class="card-title text-danger font-weight-bold"><strong>R$ 3.470,00</strong></p>
                </div>
            </div>
          </div>
          <div class="col-12 col-md-6 col-lg-4 col-xl-3">
            <div class="card destinos m-2 p-0">
              <img src={Amazonas} class="card-img-top h-60 m-0 p-0" alt="Amazonas" />
                <div class="card-body">
                  <h4 class="card-title">Amazonas</h4>
                  <p class="card-text small m-o">Ida: 29/03/2022</p>
                  <p class="card-text small m-0">De: R$ 4.470,00</p>
                  <p class="card-title text-danger"><strong>Por: R$ 3.568,00</strong></p>
                </div>
            </div>
          </div>
          <div class="col-12 col-md-6 col-lg-4 col-xl-3">
            <div class="card destinos m-2 p-0">
              <img src={Ceara} class="card-img-top h-60 m-0 p-0" alt="Ceara" />
                <div class="card-body">
                  <h4 class="card-title">Ceará</h4>
                  <p class="card-text small m-0">Ida: 31/02/2022</p>
                  <p class="card-text small m-0">De: R$ 8.753,00</p>
                  <p class="card-title text-danger"><strong>Por: R$ 6.753,00</strong></p>
                </div>
            </div>
          </div>
          <div class="col-12 col-md-6 col-lg-4 col-xl-3">
            <div class="card destinos m-2 p-0">
              <img src={Florianopolis} class="card-img-top h-60 m-0 p-0" alt="Florianopolis" />
                <div class="card-body">
                  <h4 class="card-title">Florianopolis</h4>
                  <p class="card-text small m-0">Ida: 14/05/2022</p>
                  <p class="card-text small m-0">De: R$ 3.953,00</p>
                  <p class="card-title text-danger"><strong>Por: R$ 2.999,00</strong></p>
                </div>
            </div>
          </div>
        </div>
      </div>

    </main>
  )
}

export default Promocao