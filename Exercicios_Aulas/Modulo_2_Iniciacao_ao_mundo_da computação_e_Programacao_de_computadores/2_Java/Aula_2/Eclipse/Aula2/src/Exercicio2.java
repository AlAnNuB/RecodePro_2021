import java.util.Scanner;
public class Exercicio2 {

	public static void main (String[] args) {
		// Faça uma calculadora simples que faça as 4 operações
		Scanner x = new Scanner(System.in);
		System.out.print("Digite o primeiro numero:");
		double n1 = x.nextDouble();
		System.out.print("Digite o segundo numero:");
		double n2 = x.nextDouble();
		x.close();
		
		double soma = n1+n2;
		double multiplicacao = n1*n2;
		double subtracao = n1-n2;
		double divisao = n1/n2;
		
		System.out.println("A soma é: "+ soma);
		System.out.println("A subitração é: "+ subtracao);
		System.out.println("A multiplicação é: "+ multiplicacao);
		System.out.println("A divisão é: "+ divisao);

	}

}
