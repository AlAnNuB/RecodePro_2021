import React from "react";
import Table from 'react-bootstrap/Table'

function ComprasFeitas() {

  return(
    <Table striped bordered hover>
      <thead>
        <tr>
          <th>ID Cliente</th>
          <th>Nome</th>
          <th>CPF</th>
          <th>ID Viagem</th>
          <th>Viagem</th>
          <th>Valor</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>Mark</td>
          <td>Otto</td>
          <td>@mdo</td>
        </tr>
      </tbody>
    </Table>
  )
}

export default ComprasFeitas