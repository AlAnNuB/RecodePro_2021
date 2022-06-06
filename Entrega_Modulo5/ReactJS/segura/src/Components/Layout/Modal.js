import React from "react";
import {Modal, Form} from 'react-bootstrap'
import { useCart } from "../../Context/CarrinhoContext";


function ModalCarrinho(props) {
  const cart = useCart()
 return(
   <Modal
     {...props}
     size="lg"
     aria-labelledby="ModalCentralizado"
     centered
   >
     <Modal.Header closeButton>
       <Modal.Title id="ModalCentralizado">
         Preencha os campos para efetuar a compra
       </Modal.Title>
     </Modal.Header>
     <Modal.Body>
       <Form>
         <Form.Group className="mb-3" controlId="formNameModalCompra">
           <Form.Label>Nome:</Form.Label>
           <Form.Control required type="text" placeholder="Jacinto Leite Aquino Rego" />
           <Form.Text className="text-muted">
             Digite seu nome completo.
           </Form.Text>
         </Form.Group>
         <Form.Group className="mb-3" controlId="cpfModalCompra">
           <Form.Label>C.P.F</Form.Label>
           <Form.Control required type="text" placeholder="012345678912" />
           <Form.Text className="text-muted">
              Digite seu CPF apenas números.
           </Form.Text>
         </Form.Group>
         {Object.keys(cart.cart).map(key => {
           return(
             <tr key={key}>
               <td className="hidden pb-4 md:table-cell">
                 <img className="w-20 rounded mr-2" src={cart.cart[key].product.img} alt={cart.cart[key].product.nome} />
               </td>
               <td>
                 <p className="mb-2 md:ml-4 h5 mr-2">
                   Destino: {cart.cart[key].product.nome}
                 </p>
               </td>
               <td className="hidden text-right md:table-cell">
                 <span className="text-sm lg:text-base font-medium mr-2">
                   Ida: {cart.cart[key].product.ida}
                 </span>
               </td>
               <td className="text-right">
                 <span className="text-sm lg:text-base font-medium mr-2">
                   Preço R$ {cart.cart[key].product.preco}
                 </span>
               </td>
             </tr>
           )
         })}
         <button className="btn btn-outline-danger btn-lg btn-block" type="submit">
           Comprar
         </button>
       </Form>
     </Modal.Body>
     <Modal.Footer>
       <button onClick={props.onHide}>Fechar</button>
     </Modal.Footer>
   </Modal>
 )
}

export default ModalCarrinho