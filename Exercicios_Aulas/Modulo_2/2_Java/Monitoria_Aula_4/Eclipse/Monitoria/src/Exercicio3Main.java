import java.util.Scanner;

public class Exercicio3Main {

	public static void main(String[] args) {
		// Faça um sistema de posto de gasolina usando POO aonde o cliente deve escolher
		// entre gasolina e alcool.
		// se a escolha for gasolina ele devera pagar 4 reais por litro, se for alcool
		// devera pagar 3.50.
		// Imprimir a nota fiscal depois da compra
		Scanner scan = new Scanner(System.in);
		Exercicio3 posto = new Exercicio3();

		System.out.println("Escolha o tipo de combustivel:");
		System.out.println("1 - Gasolina | 2 - Alcool");
		posto.escolha = scan.nextInt();
		System.out.println("---------------AM-----------------");
		if (posto.escolha == 1) {
			System.out.println("Digite quantos litros de Gasolina:");
			posto.qtdGasolina = scan.nextDouble();
		} else if (posto.escolha == 2) {
			System.out.println("Digite quantos litros de Alcool:");
			posto.qtdAlcool = scan.nextDouble();
		} else {
			System.out.println("Opção inválida");
		}

		posto.escolha();
		posto.encherAlcool();
		posto.encherGasolina();

		scan.close();
	}

}
