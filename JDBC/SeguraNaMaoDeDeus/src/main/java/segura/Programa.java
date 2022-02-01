package segura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Programa {
	
	private static String url = "jdbc:mysql://localhost:3306/SeguraNaMaoDeDeus";
	private static String usuario = "fsuser";
	private static String senha = "Pass123!";
	
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = createConnection();
		if (conn != null) {
			System.out.println("Conexão obtida com sucesso");
		} else {
			System.out.println("Erro ao conectar");
		}

		Scanner scan = new Scanner(System.in);

		Dados bd = new Dados();


		int resp = 0;

		do {
			System.out.println("------------------------------------------------");
			System.out.println("Seja Bem Vindo a Viagens Segura Na Mao De Deus");
			System.out.println("------------------------------------------------");
			System.out.println("Selecione uma de nossas opções: ");
			System.out.println("( 1 ) - Comprar");
			System.out.println("( 2 ) - Consultar compras");
			System.out.println("( 3 ) - Atualizar compras");
			System.out.println("( 4 ) - Remover compras");
			System.out.println("( 5 ) - Encerrar o programa");

			resp = scan.nextInt();

			if (resp == 1) {
				String Nome = "";
				int Viagem = 0;
				String CPF = "";
				
				System.out.println("Digite o seu nome: ");
				scan.skip("((?<!\\R)\\s)*");
				Nome = scan.nextLine();
				System.out.println("Digite o seu CPF: ");
				CPF = scan.next();
				scan.skip("((?<!\\R)\\s)*");
				System.out.println("Escolha uma das viagens:");
			      System.out.println("1 - Alagoas ida: 29/04/2022 Preço: R$ 3.280,00");
			      System.out.println("2 - Amazonas ida: 29/03/2022 preco: R$ 4.470,00");
			      System.out.println("3 - Ceará ida: 25/02/2022 preco: R$8.753,00");
			      System.out.println("4 - Florianopolis ida: 14/05/2022 preco: R$3.953,00");
			      System.out.println("5 - Goias ida: 29/04/2022 preco: R$5.370,00");
			      System.out.println("6 - Minas Gerais ida: 26/10/2022 preco: R$9.470,00");
			      System.out.println("7 - Paraiba ida: 03/04/2022 preco: R$2.470,00");
			      System.out.println("8 - Pernambuco ida: 05/12/2022 preco: R$4.693,00");
			      System.out.println("9 - Rio Grande do Norte ida: 05/11/2022 preco: R$5.853,00");
			      System.out.println("10 - Rio Grande do Sul ida: 30/10/2022 preco: R$6.824,00");
			      System.out.println("11 - Rio de Janeiro ida: 29/04/2022 preco: R$1.853,00");
			      System.out.println("12 - Salvador ida: 15/06/2022 preco: R$5.268,00");
			      System.out.println("13 - Tocantins ida: 13/06/2022 preco: R$5.196,00");
			      Viagem = scan.nextInt();
			      scan.skip("((?<!\\R)\\s)*");
			      
				bd.Cadastrar(Nome, CPF, Viagem);
			}else
			if (resp == 2) {
				bd.Consulta();
			}else
			if (resp == 3) {
				int ID = 0;
				String Nome = "";
				int Viagem = 0;
				String CPF = "";
				System.out.println("Digite o ID da compra que deseja alterar:");
				ID = scan.nextInt();
				System.out.println("Digite o novo nome:");
				scan.skip("((?<!\\R)\\s)*");
				Nome = scan.nextLine();
				System.out.println("Digite o CPF correto:");
				CPF = scan.next();
				System.out.println("Digite o codigo de cadastro da viagem: (1 a 13)");
				Viagem = scan.nextInt();
				bd.Atualizar(ID, Nome, CPF, Viagem);
			}else
			if (resp == 4) {
				int ID = 0;
				System.out.println("Digite o ID da compra para cancelar!");
				ID = scan.nextInt();
				bd.Deletar(ID);
			}else
			if (resp == 5) {
				System.out.println("------------------------------------------------");
				System.out.println("Obrigado por usar nosse serviços!");
				System.out.println("E nao se esqueça! Viagens Segura Na Mao De Deus");
				System.out.println("------------------------------------------------");
				break;
			}

		}while(resp != 5);
		
		scan.close();	
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Programa.url = url;
	}

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		Programa.usuario = usuario;
	}

	public static String getSenha() {
		return senha;
	}

	public static void setSenha(String senha) {
		Programa.senha = senha;
	}

	@Override
	public String toString() {
		return "Programa [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
