import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
		// que defina e escreva a média aritmética simples dos elementos
		// ímpares armazenados neste vetor.
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int par = 0;
		int[] A = new int[10];
		float med = 0;
		
		System.out.println("Digite 10 valores para calcular a média dos valores Imperes:");
		for(i = 0; i < A.length; i++) {
			System.out.print("Digite o " + i + " Valor: ");
			A[i] = scan.nextInt();
		}
		
		for(i = 0; i < A.length; i++) {
			if(A[i] %2 == 1) {
				par = par + A[i];
			}	
		}
		med = par / A.length;
		System.out.println("A média dos elementos Impares é: " + (int)med);	
		
		scan.close();
	}

}
