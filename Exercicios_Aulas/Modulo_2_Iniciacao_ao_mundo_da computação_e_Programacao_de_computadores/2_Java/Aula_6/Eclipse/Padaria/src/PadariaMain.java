
public class PadariaMain {

	public static void main(String[] args) {
		/*
		 * Crie um projeto padaria, classe pão (tipo, peso, valor), bebidas (tipo,
		 * marca, tamanho)
		 * 
		 * defina visibilidade use getters e setters
		 * 
		 * exiba na tela 3 produtos de cada
		 */
		
		Bebida bebida = new Bebida();
		Bebida bebida2 = new Bebida();
		Bebida bebida3 = new Bebida();
		Pao pao = new Pao();
		Pao pao2 = new Pao();
		Pao pao3 = new Pao();
		
		bebida.setar("Cachaça", "havana", 56.8);
		bebida.getAtributos();
		bebida2.setar("Cachaça", "Nova Esperança", 99.6);
		bebida2.getAtributos();
		bebida3.setar("Cerveja", "Heinneken", 57.6);
		bebida3.getAtributos();
		
		pao.setarPao("frances", 0.030, 0.20);
		pao.getAtributosPao();
		pao2.setarPao("Brioche", 0.5, 5.85);
		pao2.getAtributosPao();
		pao3.setarPao("Forma", 1.5, 12.89);
		pao3.getAtributosPao();
		
		
		/* Versão 1.0 feito na aula a parte de cima feito pelo discord com o Renan e com o Jonas
		bebida.setMarcaBebida("Havana");
		bebida.setTipoBebida("Cachaça");
		bebida.setTamanhoBebida(27.4);
		pao.setTipoPao("brioche");
		pao.setPesoPao(0.380);
		pao.setValorPao(17.9);
		
		bebida2.setMarcaBebida("Heinneken");
		bebida2.setTipoBebida("Cerveja");
		bebida2.setTamanhoBebida(17.4);
		pao2.setTipoPao("Frances");
		pao2.setPesoPao(0.034);
		pao2.setValorPao(0.25);
		
		bebida3.setMarcaBebida("Nova Esperança");
		bebida3.setTipoBebida("Cachaça");
		bebida3.setTamanhoBebida(27.4);
		pao3.setTipoPao("Forma");
		pao3.setPesoPao(0.800);
		pao3.setValorPao(8.95);

		bebida.retornoBebida();
		bebida2.retornoBebida();
		bebida3.retornoBebida();
		
		pao.retornoPao();
		pao2.retornoPao();
		pao3.retornoPao();

		bebida.getTipoBebida();
		*/

		
	}

}
