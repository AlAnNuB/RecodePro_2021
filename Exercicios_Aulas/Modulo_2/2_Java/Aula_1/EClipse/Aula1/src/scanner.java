import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		
		String Nome = x.nextLine();
		System.out.println("Seu nome é: " + Nome);
		x.close();
	}

}
