function Card(props) {
  return(
    <div class="col-12 col-md-6 col-lg-4 col-xl-3">
      <div class="card destinos m-2 p-0">
        <img src={props.img} class="card-img-top h-60 m-0 p-0" alt="Alagoas" />
        <div class="card-body">
          <h4 class="card-title">{props.nome}</h4>
          <p class="card-text small m-0">Ida: {props.ida}</p>
          <p class="card-title text-danger font-weight-bold"><strong>R$ {props.preco}</strong></p>
        </div>
      </div>
    </div>
  );
}

export default Card