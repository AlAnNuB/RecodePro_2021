import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
		// que determine a soma dos elementos armazenados neste vetor que
		// são múltiplos de 5.
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int div = 0;
		int[] A = new int[10];
		
		System.out.println("Digite 10 numeros para somar os multiplos de 5. ");
		for(i = 0; i < A.length; i++) {
			System.out.print("Digite o " + i + " Valor: ");
			A[i] = scan.nextInt();
		}
		
		for(i = 0; i < A.length; i++) {
			if(A[i] %5 == 0) {
				div = div + A[i];
			}	
		}
		System.out.println("O Valor da soma dos numeros divisiveis por 5 é: " + div);	
		
		scan.close();
	}

}
