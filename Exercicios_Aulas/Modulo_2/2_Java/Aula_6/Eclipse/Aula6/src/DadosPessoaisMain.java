
public class DadosPessoaisMain {

	public static void main(String[] args) {
		/*
		 * Crie um projeto, aonde teremos uma classe Dados pessoais seus atributos:
		 * Public: Nome, private: Email e private: Telefone.
		 * em outra classe crie um obejto e exiba informações.
		 * definir: public, private e protected
		 */
		DadosPessoais dados = new DadosPessoais();
		
		dados.setNome("Alan");
		dados.setEmail("alan@cool.com");
		dados.setTelefone(995788796);
		dados.status();
		
		
	}

}
