import './index.css'

const Cards = () => {
    return (
        <div>
            <div className="row">
                <div className="col divCard">
                    <div className="card">
                        <div className="card-image">
                            <img src="https://static6.depositphotos.com/1030334/671/i/600/depositphotos_6710151-stock-photo-eyes.jpg" />
                                <span className="card-title">Card Title</span>
                                <a className="btn-floating halfway-fab waves-effect waves-light red"><i className="bi bi-trash"></i></a>
                        </div>
                        <div className="card-content">
                            <h5>R$ 40,00</h5>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    )
}

export default Cards