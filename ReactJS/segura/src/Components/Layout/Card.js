import React from 'react'
import { useCart } from '../../Context/CarrinhoContext';

function Card(props, product) {

  const cart = useCart()

  const add = (product) => () => {
    cart.addToCart(product)
  }

  return (
    <>
      <div className="col-12 col-md-6 col-lg-4 col-xl-3">
        <div className="card destinos m-2 p-0">
          <img src={props.img} className="card-img-top h-60 m-0 p-0" alt={props.nome} />
          <div className="card-body">
            <h4 className="card-title">{props.nome}</h4>
            <p className="card-text small m-0">Ida: {props.ida}</p>
            <p className="card-title text-danger font-weight-bold"><strong>R$ {props.preco}</strong></p>
          </div>
          <button type="submit" onClick={add(product)} className="btn btn-outline-danger justify-content-center align-items-center m-2">
            <i className="bi bi-cart-plus-fill"> </i>
            Comprar
          </button>
        </div>
      </div>
    </>
  );
}

export default Card