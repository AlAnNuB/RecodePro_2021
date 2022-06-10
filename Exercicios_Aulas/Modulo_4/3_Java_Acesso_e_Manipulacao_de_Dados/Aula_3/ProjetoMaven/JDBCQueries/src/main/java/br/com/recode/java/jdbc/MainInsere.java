package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainInsere {

	public static void main(String[] args) throws Exception {
		String[] nomesProdutos = { "Feijão", "Batata", "Cebola", "Tomate" };

		String url = "jdbc:mysql://localhost:3306/recode";

		try (Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!")) {
			System.out.println("Conectou no banco de dados!");

// String sql = "INSERT INTO produto (NOME, VALOR) VALUES ('CANETA', 4.50)";
//
// try (Statement stmt = conn.createStatement()) {
// stmt.executeUpdate(sql);
// System.out.println("Produto inserido");
//
// conn.close();
// }
			try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO produto (NOME) VALUES (?)")) {
				for (String nomeProduto : nomesProdutos) {
					stmt.setString(1, nomeProduto);
					stmt.executeUpdate();
				}
				conn.close();
			}
		}
	}
}