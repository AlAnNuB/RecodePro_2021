import './index.css'

const Formulario = () => {
    return (
        <div>
            <div className="row">
                <form className="col s12">
                    <div className="row">
                        <div className="input-field col s12">
                            <input type="text" className="validate" />
                                <label>Nome do produto</label>
                        </div>
                        <div className="input-field col s12">
                            <input  type="text" className="validate" />
                                <label>Imagem</label>
                        </div>
                        <div className="input-field col s12">
                            <input  type="number" className="validate" />
                                <label>Preço</label>
                        </div>
                        <div className="col s12">
                            <a className="waves-effect waves-light btn" type="submit">Enviar</a>
                        </div>
                    </div>
                   
                </form>
            </div>
        </div>
    )
}

export default Formulario