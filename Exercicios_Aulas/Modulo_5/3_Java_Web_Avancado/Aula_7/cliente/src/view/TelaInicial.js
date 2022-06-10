import { useState } from 'react'
import { Form, Button } from "react-bootstrap"

import { setToken, adicionarUsuario } from "../net/service"

function TelaInicial() {

    const [username, setUsername] = useState("");
    const [senha, setSenha] = useState("");

    const handleUsername = (e) => {
        setUsername(e.target.value);
    }

    const handleSenha = (e) => {
        setSenha(e.target.value);
    }

    const execAdd = () => {
        adicionarUsuario(username,senha).then(
            (retorno) => console.log(retorno))    
    }

    const execUpdate = () => {
        setToken(username,senha)
    }

    return (
    <>
        <Form>
            <Form.Group className="mb-3">
                <Form.Label>Login</Form.Label>
                <Form.Control type="text" placeholder="Login do Usuario" 
                              value={username}
                              onChange={handleUsername}/>
                </Form.Group>
                <Form.Group className="mb-3">
                    <Form.Label>Senha</Form.Label>
                    <Form.Control type="password" value={senha}
                                  onChange={handleSenha}/>
                </Form.Group>

                </Form>
                <Button variant="primary" onClick={execUpdate}>
                    Definir Login
                </Button>
                <Button variant="secondary" onClick={execAdd}>
                    Adicionar
                </Button>

    </>
    );

}

export default TelaInicial;