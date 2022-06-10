import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
		// de um grupo de pessoas. Escreva um programa que determine e
		// escreva a menor e a maior idades e suas respectivas posições.
		
		Scanner scan = new Scanner(System.in);
		
		int[] idade = new int[10];
		int maiI = 0;
		int conM = 0;
		int cont = 0;
		int menI = 1000;
		
		System.out.println("Contador de pessoas com mais de 35 anos.");
		System.out.println();
		for (int i = 0; i < idade.length; i++) {
			System.out.print("Digite a " + i + " idade: ");
			idade[i] = scan.nextInt();
			
			if(idade[i] > maiI) {
				maiI = idade[i];
				conM = i;
			}
			if(idade[i] < menI) {
				menI = idade[i];
				cont = i;
			}
		}
		System.out.println("A pessoa mais nova é " + cont + "°. Com " + menI + " anos.");
		System.out.println();
		System.out.println("A pessoa mais velha é " + conM + "°. Com " + maiI + " anos.");

		scan.close();
	}

}
