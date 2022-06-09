import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// 17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
		// de um grupo de pessoas. Escreva um programa que determine e
		// escreva a quantidade de pessoas que possuem idade superior a 35
		// anos.
		Scanner scan = new Scanner(System.in);
		
		int[] idade = new int[10];
		int cont = 0;
		
		System.out.println("Contador de pessoas com mais de 35 anos.");
		System.out.println();
		for (int i = 0; i < idade.length; i++) {
			System.out.print("Digite a " + i + " idade: ");
			idade[i] = scan.nextInt();
			if (idade[i] > 35) {
				cont = cont + 1;
			}
		}
		
		System.out.println("O número de pessoas com mais de 35 anos é: " + cont);
		
		
		scan.close();
	}

}
