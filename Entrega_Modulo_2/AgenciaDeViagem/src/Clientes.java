
import java.util.Scanner;

public class Clientes {
	Scanner scan = new Scanner(System.in);
	
	private String[] nome = new String[3];
	private int[] idade = new int[100];
	private int[] documento = new int[3];
	private String[] endereço = new String[3];
	private String[] sexo = new String[3];
	private int i;
	
	public void setarCliente() {
		for (i = 0; i < nome.length; i++) {
		System.out.println("Digite o nome do " + (i+1) + " cliente: ");
		nome[i] = scan.nextLine();
		scan.skip("((?<!\\R)\\s)*");
		System.out.println("Digite a idade do " + (i+1) + " cliente: ");
		idade[i] = scan.nextInt();
		scan.skip("((?<!\\R)\\s)*");
		System.out.println("Digite o Sexo do "+ (i+1) +" cliente ( M | F ): ");
		sexo[i] = scan.next();
		scan.skip("((?<!\\R)\\s)*");
		System.out.println("Digite o endereço do " + (i+1) + " cliente: ");
		endereço[i] = scan.nextLine();
		scan.skip("((?<!\\R)\\s)*");
		System.out.println("Digite o Documento do " + (i+1) + " cliente: ");
		documento[i] = scan.nextInt();
		scan.skip("((?<!\\R)\\s)*");
		
		}
		
	}
	
	public void Resposta() {
		for (i = 0; i < nome.length; i++) {	
			if(nome[i] == null) {
				System.out.println("------------------------------------------------");
				System.out.println("Não existe nenhum Registro !!! ");
				System.out.println("------------------------------------------------");
				break;
			}else {
				System.out.println("------------------------------------------------");
				System.out.println("O nome do " + (i+1) + "° cadastrado é : " + nome[i]);
				System.out.println("A idade do " + (i+1) + "° cadastrado é : " + nome[i]);
				System.out.println("Seu sexo é: " + sexo[i]);
				System.out.println("Seu endereço é: " + endereço[i]);
				System.out.println("Seu documento é: " + documento[i]);
				}
			}
	}
	
}
