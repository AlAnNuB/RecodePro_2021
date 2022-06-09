import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		// 16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
		// que calcule e escreva: a) a soma de elementos armazenados neste
		// vetor que são inferiores a 15; b) a quantidade de elementos
		// armazenados no vetor que são iguais a 15; e c) a média dos
		// elementos armazenados no vetor que são superiores a 15.
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int i;
		int men = 0;
		int igu = 0;
		int mai = 0;
		int indM = 0;
		int indI = 0;
		int indS = 0;
		float med = 0;
		
		System.out.println("Digite 10 valores: ");
		for(i = 0; i < A.length; i++) {
			System.out.println("Digite um numero: ");
			A[i] = scan.nextInt();
			
			if(A[i] < 15) {
				men = men + A[i];
				indM = indM + 1;
			}
			if(A[i] == 15) {
				igu = igu + A[i];
				indI = indI + 1;
			}
			if(A[i] > 15) {
				mai = mai + A[i];
				indS = indS + 1;
			}
		}
			
			
		med = (mai/A.length);
		
		System.out.println("A quantidade de numeros MENOR que 15 é: " + indM);
		System.out.println("A soma dos numeros MENOR que 15 é: " + men);
		System.out.println();
		System.out.println("A quantidade de numeros IGUAL a 15 é: " + indI);
		System.out.println("A soma dos numeros IGUAL que 15 é: " + igu);
		System.out.println();
		System.out.println("A quantidade de numeros MAIOR que 15 é: " + indS);
		System.out.println("A soma dos numeros MAIOR que 15 é: " + mai);
		System.out.println();
		System.out.println("A média de numeros MAIOR que 15 é: " + (int)med + "%");

		
		
		
		
		scan.close();
	}

}
