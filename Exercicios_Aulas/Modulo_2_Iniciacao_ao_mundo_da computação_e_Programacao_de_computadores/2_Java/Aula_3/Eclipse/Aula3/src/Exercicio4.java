import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// 4- Criar um vetor A com 15 elementos inteiros. 
		// Construir um vetor B de mesmo tamanho sendo que cada elemento do vetor B
		// deverá ser a raiz quadrada do respectivo elemento de A, ou seje:
		// B[i] = sqrt(A[i]). 
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
		System.out.println("Entre com o valor da posição: " + i);
		vetorA[i] = scan.nextInt();
		// Math.sqrt calcular a raiz quadrada de vatorA
		vetorB[i] = (int) java.lang.Math.sqrt(vetorA[i]);
		}
		
		System.out.println("Vetor A: ");
		
		for (int i=0; i<vetorA.length; i++) {
		System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B: ");
		
		for (int i=0; i<vetorB.length; i++) {
		System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

		scan.close();
	}

}
