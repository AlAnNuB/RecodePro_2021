package aplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/recode";
		Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!");
		System.out.println("Você deseja cadastrar um Produto? S/N");
		String resposta = sc.next();
		String nome = "";
		float valor = 0f;
		if (resposta.equals("S")) {
			System.out.println("Digite o nome do produto: ");
			nome = sc.next();
			System.out.println("Digite o valor do produto: ");
			valor = sc.nextFloat();
		} else {
			System.out.println("Obgd, volte sempre!");
		}
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO produto(Nome, valor) " + " VALUES(?, ?)");
			ps.setString(1, nome);
			ps.setFloat(2, valor);
			ps.execute();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM produto");
			System.out.println("--------- DADOS CADASTRADOS ---------");
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " - " + rs.getString("Nome") + " - " + rs.getDouble("valor"));
			}
		} catch (SQLException e) {
			System.out.println("Abobora " + e.getMessage());
		} finally {
			conn.close();
		}
		sc.close();
	}
}