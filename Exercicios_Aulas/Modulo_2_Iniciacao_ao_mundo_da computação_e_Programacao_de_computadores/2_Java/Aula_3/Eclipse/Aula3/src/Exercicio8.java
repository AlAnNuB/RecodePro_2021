import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// 8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
		// um vetor C, onde cada elemento de C é a multiplicação dos
		// respectivos elementos em A e B, ou seja:
		// C[i] = A[i] * B[i].
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
		System.out.println("Entre com o valor da posição: " + i);
		vetorA[i] = scan.nextInt();
		vetorB[i] = vetorA[i];
		vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.println("Vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
		System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor C: ");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

		scan.close();

	}

}
