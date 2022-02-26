import React from 'react';

import Cards from '../Layout/Card'

import {Locais} from '../../database/Locais'

function Destinos() {
  return (
    <main>
      <div className="container">
        <div className="row">
          {Locais.map((locais,index) => (
            <Cards nome={locais.nome} img={locais.img} ida={locais.ida} preco={locais.preco} />
          ))}
         
        </div>
      </div>
    </main>
  )
}

export default Destinos


