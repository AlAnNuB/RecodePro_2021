package segura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/SeguraNaMaoDeDeus";
		Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!");
		System.out.println("Você deseja cadastrar um Produto? S/N");
		String resposta = sc.next();
		String nome = "";
		int viagem = 0;
		String CPF = "";
		if (resposta.equals("S")) {
			System.out.println("Digite o seu nome: ");
			sc.skip("((?<!\\R)\\s)*");
			nome = sc.nextLine();

			System.out.println("Digite o seu CPF: ");
			CPF = sc.next();
			sc.skip("((?<!\\R)\\s)*");
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
		      viagem = sc.nextInt();
		      sc.skip("((?<!\\R)\\s)*");
		} else {
			System.out.println("Obgd, volte sempre!");
		}
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Clientes(Nome, CPF, IdViagens) " + " VALUES(?, ?, ?)");
			ps.setString(1, nome);
			ps.setString(2, CPF);
			ps.setInt(3, viagem);
			ps.execute();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Clientes inner join Viagens on Clientes.IdViagens = Viagens.IdViagens");
			System.out.println("------------------- DADOS CADASTRADOS ---------------------");
			System.out.println("Id	-	Nome	-	CPF	-	Destino	-	Ida	-	Preço");
			while (rs.next()) {
				System.out.println(rs.getInt("IdCliente") + " - " + rs.getString("Nome") + " - " + rs.getString("CPF") + " - " + rs.getString("Destinos") + " - " + rs.getDate("Ida") + " - R$" + rs.getDouble("Preco"));
			}
		} catch (SQLException e) {
			System.out.println("Erro : " + e.getMessage());
		} finally {
			conn.close();
		}
		sc.close();

	}

}
