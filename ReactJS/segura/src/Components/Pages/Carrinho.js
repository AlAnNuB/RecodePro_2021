import React from 'react'
import { useCart } from '../../Context/CarrinhoContext'
import Container from  '../Layout/Container'

function Carrinho(props) {
  const cart = useCart()

  const remove = id => () => {
    cart.removeFromCart(id)
  }
  return (

    <div className="flex justify-center my-6">
      <div className="flex flex-col w-full p-8 text-gray-800 bg-white shadow-lg pin-r pin-y md:w-4/5 lg:w-4/5">
        <div className="flex-1">
          <table className="w-full text-sm lg:text-base" cellspacing="0">
            <thead>
              <tr className="h-12 uppercase">
                <th className="hidden md:table-cell"></th>
                <th className="text-left">Produto</th>
                <th className="lg:text-right text-left pl-5 lg:pl-0">
                  <span className="lg:hidden" title="Quantity">Qtd</span>
                  <span className="hidden lg:inline">Quantidade</span>
                </th>
                <th className="hidden text-right md:table-cell">Data Partida</th>
                <th className="text-right">Preço</th>
              </tr>
            </thead>
            <tbody>
              {Object.keys(cart.cart).map(key => {
                return (
                  <tr key={key}>
                    <td className="hidden pb-4 md:table-cell">
                      <a href="#">
                        <img src={cart.cart[key].product.img} />
                      </a>
                    </td>
                    <td>
                      <p className="mb-2 md:ml-4 h5">{cart.cart[key].product.nome}</p>
                      <button type="submit" className="text-gray-700 md:ml-4" onClick={remove(key)}>
                        <i class="bi bi-trash btn btn-outline-danger"> Remover</i>
                      </button>
                    </td>
                    <td className="justify-center md:justify-end md:flex mt-6">
                      <div className="w-20 h-10">
                        <div className="relative flex flex-row w-full h-8">
                          <input type="number" value="1"
                            className="w-full font-semibold text-center text-gray-700 bg-gray-200 outline-none focus:outline-none hover:text-black focus:text-black" />
                        </div>
                      </div>
                    </td>
                    <td className="hidden text-right md:table-cell">
                      <span className="text-sm lg:text-base font-medium">
                        R$ {cart.cart[key].product.ida}
                      </span>
                    </td>
                    <td className="text-right">
                      <span className="text-sm lg:text-base font-medium">
                        R$ {cart.cart[key].product.preco}
                      </span>
                    </td>
                  </tr>
                )
              })}
            </tbody>
          </table>
        </div>
          <button type="button" class="btn btn-outline-secondary btn-lg btn-block">Comprar</button>
      </div>
    </div>

  )
}

export default Carrinho