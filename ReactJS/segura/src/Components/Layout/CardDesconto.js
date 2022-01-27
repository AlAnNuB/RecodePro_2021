function CardDesconto(props) {
  return(
    <div class="col-12 col-md-6 col-lg-4 col-xl-3">
      <div class="card destinos m-2 p-0">
        <img src={props.img} class="card-img-top h-60 m-0 p-0" alt="Alagoas" />
        <div class="card-body">
          <h4 class="card-title">{props.nome}</h4>
          <p class="card-text small m-0">Ida: {props.ida}</p>
          <p class="card-text small m-0">De: R$ {props.desconto}</p>
          <p class="card-title text-danger font-weight-bold"><strong>R$ {props.preco}</strong></p>
        </div>
        <button type="submit" className="btn btn-outline-danger justify-content-center align-items-center mt-n5 mb-5 mx-2">
          <i class="bi bi-cart-plus-fill"> </i>
          Comprar
        </button>
      </div>
    </div>
  );
}

export default CardDesconto