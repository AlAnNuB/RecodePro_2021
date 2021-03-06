import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// 20. Implementar um programa que obtenha a cotação do dólar (U$) em
		// relação ao real (R$) e a seguir armazene em vetor A com 20
		// elementos as seguintes conversões:
		// 21. A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
		Scanner scan = new Scanner(System.in);
		
		float dolar;
		float[] A = new float[20];
		float[] real = new float[A.length];
		int i = 0;
		
		System.out.print("Digite o valor do dolar: ");
		dolar = scan.nextFloat();
		System.out.println();
		
		for(i = 0; i < A.length; i++) {
			System.out.print("Digite o " + i + " valor: ");
			A[i] = scan.nextFloat();
			
			real[i] = A[i] * dolar;
		}
		for(i = 0; i < A.length; i++) {
			System.out.println("O indice " + i + " tem o valor: " + real[i]);
		}
		
		scan.close();
	}

}
