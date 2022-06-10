//Fazer um programa que interaja com o usuário, pedindo um nome e um valor para salvar no banco de dados.

package aplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Colegacomerro {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/recode";
		Connection conn = DriverManager.getConnection(URL, "fsuser", "Pass123!");

		Scanner prod = new Scanner(System.in);
		String R, N;
		double V = 0;

		System.out.println("Deseja registrar um produto? S/N");
		R = prod.next();
		if (R.equals("S")) {
			System.out.print("Informe o nome do produto: ");
			N = prod.next();
			System.out.print("Informe o valor do produto: ");
			V = prod.nextDouble();
			prod.close();
			System.out.println();

			try {
				PreparedStatement pst = conn.prepareStatement("INSERT INTO produto (Nome, Valor)" + " VALUES (?, ?)");
				pst.setString(1, N);
				pst.setDouble(2, V);
				pst.execute();

				System.out.println("Produto registrado com sucesso!");

				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM produto");

				System.out.println("--------------- Produtos Registrados ---------------");

				while (rs.next()) {
					System.out.println(rs.getInt("ID") + "|" + rs.getString("Nome") + "|" + rs.getDouble("Valor"));
				}

			} catch (SQLException e) {
				System.out.println("Error " + e.getMessage());
			} finally {
				conn.close();
			}
		} else {
			System.out.println("Volte sempre!");
		}
	}

}