import React from 'react';
import AviaoPrincipal from '../IMG/AviaoPrincipal.jpg'
function Home() {
  return (
    <main className="container-fluid">
      <div className="row">
        <div className="col-12 col-sm-6 mb-5 mt-3">
          <img className="rounded img-fluid" id="AviaoPrincipal" src={AviaoPrincipal} alt="Imagem Avião Principal" />
        </div>
        <div className="col-12 col-sm-6 align-self-center TextoEntrada">
          <h1> Segura na mão de Deus</h1>
          <h3> Onde o Céu é o nosso objetivo e do chão não passa!</h3>
        </div>
      </div>

    </main>

  )
}

export default Home