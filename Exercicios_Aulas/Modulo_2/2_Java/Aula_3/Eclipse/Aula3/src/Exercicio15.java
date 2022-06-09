import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// 15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
		// que defina o percentual de elementos pares e ímpares,
		// respectivamente, armazenados neste vetor.
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int par = 0;
		int imp = 0;
		int[] A = new int[10];
		float medP = 0;
		float medI = 0;
		
		
		System.out.println("Vamos definir o percentual de numeros Pares e Impares");
		for(i = 0; i < A.length; i++) {
			System.out.print("Digite o " + i + " Valor: ");
			A[i] = scan.nextInt();
		}
		
		for(i = 0; i < A.length; i++) {
			if(A[i] %2 == 0) {
				par = par + 1;
				
			}else if (A[i] %2 == 1) {
				imp = imp + 1;
			}	
		}
		medP = (par*100) / A.length;
		System.out.println("A porcentagem de numeros PARES é: " + (int)medP + "%");	
		
		medI = (imp*100) / A.length;
		System.out.println("A porcentagem de numeros IMPARES é: " + (int)medI + "%");	
		
		scan.close();
	}

}
