import java.util.Scanner;
public class Exercicio23 {

	public static void main(String[] args) {
		// 23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
		// que verifique se "todos" os elementos do vetor A são pares. Se pelo
		// menos um elemento do vetor não for par o processo de repetição para
		// percorrer os elementos do vetor deve ser encerrado, como sugestão:
		// utilize uma variável do tipo flag para atingir este propósito.
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int[] A = new int[10];
		
		System.out.println("Digite até 10 numeros pares: ");
		for(i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
			
			if(A[i] %2==0) {
				
			}else {
				break;
			}
		}
		
		System.out.println("Os numeros validos digitados foram: ");
		for (i = 0; i < A.length; i++) {
			if(A[i] %2==0) {
				System.out.print(A[i] + " | ");
			}else {
				System.exit(0);
			}
		}
	
		
		scan.close();
	}

}
