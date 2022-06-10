import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
		// que defina e escreva a soma de todos os elementos armazenados neste vetor.
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int soma = 0;
		
		System.out.println("Digite 10 valores para serem somados:");
		for(int i = 0; i < A.length; i++) {
			System.out.print("Digite um número: ");
			A[i] = scan.nextInt();
			
			soma = soma + A[i];
		}
		System.out.println("A soma de todos os valores é: " + soma);
		scan.close();
	}

}
