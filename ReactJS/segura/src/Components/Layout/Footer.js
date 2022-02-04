import React from 'react';
import BandeirasCartao from '../IMG/BandeirasCartao.png'
function Footer() {
  return (
    <footer class="bg-light text-center text-lg-start footer navbar-fixed-bottom">
      <hr />
        <div class="container">
          <h3 class="small font-weight-bolder">Formas de Pagamento:</h3>
          <img id="BandeirasPagamento" src={BandeirasCartao} alt="Formas de Pagamento" />
        </div>
        <br />

          <div class="d-flex">
            <ul class="list-inline mx-auto justify-content-center">
              <li class="list-inline-item small">| Segura na mão de Deus |</li>
              <li class="list-inline-item small">| CNPJ: 66.666.666/0001-66 |</li>
              <li class="list-inline-item small">| Rua da Libertação, 666 - Jardim dos Céus - SP |</li>
              <li class="list-inline-item small">| CEP: 06666-666 |</li>
            </ul>
          </div>
          <p class="text-center small">&#169; 2022 Viagens Segura na mão de Deus - Todos os
          direitos reservados </p>
    </footer>
  )
}

export default Footer