import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	// 1-Escreva um programa que mostre quando uma lâmpada esta ligada ou desligada.
		
		Scanner scan = new Scanner(System.in);
		
		int lampada = 0;
		do
		{
		System.out.println("Digite 1 - para acender a lampada ");
		System.out.println("Digite 2 - para apagar a lampada ");
		System.out.println("--------------AM--------------------");
		lampada = scan.nextInt();
		
		if (lampada == 1) {
			System.out.println("A lampada está Ligada!");
		}else if (lampada == 2){
			System.out.println("A lampada está Apagada!");
		}else {
			System.out.println("--------------AM--------------------");
			System.out.println("Valor inválido! ");
			System.out.println("--------------AM--------------------");
		}
		}while(lampada != 1 && lampada != 2);
		scan.close();
	}

}
