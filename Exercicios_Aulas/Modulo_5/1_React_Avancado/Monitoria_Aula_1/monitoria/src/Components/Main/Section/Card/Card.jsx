import './Card.css'

export default (props) => {
    return (
        <div className="card">
            <img src={props.foto} alt="Cards de Fotos" />
        </div>
    );
}