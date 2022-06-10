package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainBatch {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/recode";

		try (Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!")) {
			System.out.println("Conectou no banco de dados!");

			String sql = "INSERT INTO produto (NOME) VALUES (?)";

			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				for (int i = 1; i <= 1000; i++) {
					stmt.setString(1, "Produto " + i);
					stmt.executeUpdate();
				}
				stmt.executeBatch();
			}
		}
	}
}
