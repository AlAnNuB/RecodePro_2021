import Section from "./Section/Section";

export default () => {
    return (
        <main>
            <Section></Section>
            <section className="container">
                <div className="row divForm">
                    <h2>Contate-nos</h2>
                    <div className="col-sm-12 col-md-6 mt-4">
                        <form action="">
                            <div className="form-floating mb-3 mt-4">
                                <input type="email" className="form-control" placeholder="name@example.com" />
                                <label for="floatingInput">Email</label>
                            </div>
                            <div className="form-floating mb-3">
                                <textarea className="form-control" placeholder="Leave a comment here"></textarea>
                                <label for="floatingTextarea">Mensagem</label>
                            </div>
                            <div>
                                <button type="submit" className="btn btnContato mb-5">Enviar</button>
                            </div>
                        </form>
                    </div>
                    <div className="col-sm-12 col-md-6">
                        <div className="divImg">
                            <img src="./images/recode-logo.png" alt="" />
                        </div>
                    </div>
                </div>
            </section>
        </main >
    );
}