import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		// 11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
		// que defina e escreva a quantidade de elementos armazenados neste
		// vetor que são pares.
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int par = 0;
		int[] A = new int[10];
		
		for(i = 0; i < A.length; i++) {
			System.out.print("Digite o " + i + " Valor: ");
			A[i] = scan.nextInt();
		}
		
		for(i = 0; i < A.length; i++) {
			if(A[i] %2 == 0) {
				par = par + 1;
			}	
		}
		System.out.println("Nesse vetor tem " + par + " valores PAR.");	
		
		scan.close();
	}

}
