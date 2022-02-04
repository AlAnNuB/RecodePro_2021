import React from 'react';
import VideoAviao from '../IMG/AviaoVideo.mp4'

function Contato() {

  (function () {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
      .forEach(function (form) {
        form.addEventListener('submit', function (event) {
          if (!form.checkValidity()) {
            event.preventDefault()
            event.stopPropagation()
          }

          form.classList.add('was-validated')
        }, false)
      })
  })()
  
  return(
    <main className="container-fluid">
      <div className="row">
        <div className="col-12 col-sm-6 mb-5 mt-3">
          <figure>
            <video className="mt-5 embed-responsive embed-responsive-16by9 rounded" id="Video" width="600" height="400" autoplay="true" loop muted>
              <source className="embed-responsive-item" src={VideoAviao} type="video/mp4" />
            </video>
          </figure>
        </div>
        <div className="col-12 col-sm-6 align-self-center TextoEntrada mt-5">
          <h1> Segura na mão de Deus</h1>
          <form className="g-3 needs-validation" novalidate>
            <div className="form-group">
              <label for="textNome" className="form-label">Nome:</label>
              <input id="textNome" className="form-control" placeholder="Digite seu Nome..." type="text" required />
            </div>

            <div className="form-group">
              <label for="inputEmail" className="form-label">Email:</label>
              <input id="inputEmail" className="form-control" placeholder="Digite seu E-mail..." type="email" required />
            </div>

            <div className="form-group">
              <label for="inputTextarea" className="form-label">Nos diga o motivo de seu contato:</label><br />
              <textarea className="form-control" name="taxtarea" id="inputTextarea" cols="30" rows="5"
                placeholder="Digite seu texto aqui..." required></textarea>
            </div>
            <button type="submit" className="btn btn-outline-primary mt-2">Enviar</button>
          </form>
        </div>
      </div>


    </main>
  )
}

export default Contato