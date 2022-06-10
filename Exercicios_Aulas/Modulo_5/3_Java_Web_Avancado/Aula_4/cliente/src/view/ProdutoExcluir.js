import React from "react"
import {Modal, Button} from 'react-bootstrap'

export class ProdutoExcluir extends React.Component {
    render() {
        return(
        <Modal show={this.props.show} onHide={this.props.onClose()}>
            <Modal.Header closeButton>
                <Modal.Title>Exclusão</Modal.Title>
            </Modal.Header>
            <Modal.Body>
                Confirma a exclusão do produto {this.props.codigo} ?
            </Modal.Body>
            <Modal.Footer>
                <Button variant="danger" onClick={this.props.onDelete()}>
                    Sim
                </Button>
                <Button variant="secondary" onClick={this.props.onClose()}>
                    Não
                </Button>
            </Modal.Footer>                
        </Modal>
      );
    }
} 