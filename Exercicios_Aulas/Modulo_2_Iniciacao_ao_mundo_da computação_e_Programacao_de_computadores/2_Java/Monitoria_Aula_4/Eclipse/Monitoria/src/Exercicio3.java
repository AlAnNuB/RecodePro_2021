
public class Exercicio3 {
	boolean gasolina;
	double qtdGasolina;
	double totalGasolina;
	double qtdAlcool;
	double totalAlcool;
	int escolha;
	
	
	void escolha() {
		if(escolha == 1) {
			gasolina = true;
		}else if(escolha == 2) {
			gasolina = false;
		}
	}
	
	void encherGasolina() {
		if (gasolina == true) {
			totalGasolina = qtdGasolina * 4;
			System.out.println("Voce colocou " + qtdGasolina + " litros. E tem que pagar R$" + totalGasolina);
			
		}
	}
	void encherAlcool() {
		if (gasolina == false) {
			totalAlcool = qtdAlcool * 3.50;
			System.out.println("Voce colocou " + qtdAlcool+ " litros. E tem que pagar R$" + totalAlcool);
		}
	}

}
