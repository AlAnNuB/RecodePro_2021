package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainResultset {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/recode";

		try (Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!")) {
			System.out.println("Conectou no banco de dados!");

			String sql = "SELECT ID, NOME FROM produto";

			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int id = rs.getInt("ID");
						String nome = rs.getString("NOME");

						System.out.println("ID = " + id);
						System.out.println("Nome = " + nome);
						System.out.println("----------------------");
					}
				}
			}
		}
	}
}
