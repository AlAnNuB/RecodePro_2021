import React, { createContext, useState, useContext, useEffect } from 'react';

export const CarrinhoContext = createContext();

export const CartProvider = ({ children }) => {
  const [cart, setCart] = useState({})
 
  useEffect(() => {
    const cartLocal = window.localStorage.getItem('cart')
    if(cartLocal) {
      setCart(JSON.parse(cartLocal))
    }
  },[])


  const addToCart = product => {
    setCart(old => {
      console.log(cart)
      let quantity = 0 
      if (old[product.id]) {
        quantity = old[product.id].quantity
      }
      const newCart = {
      ...old,
      [product.id]: {
        quantity: quantity+1,
        product,
      }
    }
    window.localStorage.setItem('cart', JSON.stringify(newCart))
    return newCart
  })
  }

  const removeFromCart = (productId) => {
    setCart(old => {
      const newCart = {}
      Object.keys(old).forEach(id => {
        if(id !== productId) {
          newCart[id] = old[id]
        }
      })
      window.localStorage.setItem('cart', JSON.stringify(newCart))
      return newCart
    })
  }

  return(
    <CarrinhoContext.Provider value={{ cart, addToCart, removeFromCart }}>
      {children}
    </CarrinhoContext.Provider>
  )
}

export const useCart = () => {
  const cart = useContext(CarrinhoContext)  
  return cart
}