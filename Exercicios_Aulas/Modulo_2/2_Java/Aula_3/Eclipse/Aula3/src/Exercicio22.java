import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {
		// 22. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
		// 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
		// para implementar um programa que determine o percentual de
		// números 0's e 1's existentes no vetor A.
		Random random = new Random();
		
		int[] A = new int[10];
		int i = 0;
		float zero = 0;
		float um = 0;
		float z = 0;
		float u = 0;
		
		for(i = 0; i < A.length; i++) {
			A[i] = random.nextInt(2);
			System.out.println(A[i]);
		}
		
		for(i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				zero = zero + 1;
			}else
			if (A[i] == 1) {
				um = um + 1;
			}
		}
		z = (zero*100)/ 10;
		u = (um*100)/10;
		
		System.out.println("A porcentagem de ZERO: " + z + " %");
		System.out.println("A porcentagem de UM: " + u + " %");
	}

}
