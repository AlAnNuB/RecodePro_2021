import java.util.Scanner;

public class Home {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Clientes cliente = new Clientes();

		int resp = 0;

		do {
			System.out.println("------------------------------------------------");
			System.out.println("Seja Bem Vindo a Viagens Segura Na Mao De Deus");
			System.out.println("------------------------------------------------");
			System.out.println("Selecione uma de nossas opções: ");
			System.out.println("( 1 ) - Cadastrar 3 novos clientes");
			System.out.println("( 2 ) - Consultar clientes cadastrados");
			System.out.println("( 3 ) - Sair do programa");
			resp = scan.nextInt();

			if (resp == 1) {
				cliente.setarCliente();
				System.out.println("------------------------------------------------");
				System.out.println("Clientes Cadastrados com sucesso!");
				System.out.println("------------------------------------------------");
			}else
			if (resp == 2) {
				cliente.Resposta();
			}else
			if (resp == 3) {
				System.out.println("------------------------------------------------");
				System.out.println("Obrigado por usar nosse serviços!");
				System.out.println("E nao se esqueça! Viagens Segura Na Mao De Deus");
				System.out.println("------------------------------------------------");
				break;
			}

		}while(resp != 3);

		scan.close();
	}

}
