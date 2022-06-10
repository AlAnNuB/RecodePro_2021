package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CommitRollbackOK {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/recode";

		try (Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!")) {
			System.out.println("Conectou no banco de dados!");

			String sql1 = "INSERT INTO produto (ID, NOME) VALUES (?, ?)";
			String sql2 = "INSERT INTO item (PRODUTO_ID, PRECO) VALUES (?, ?)";

			try (PreparedStatement stmt1 = conn.prepareStatement(sql1);
				 PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
				
				stmt1.setInt(1, 1);
				stmt1.setString(2, "Feijão");
				stmt1.executeUpdate();
				
				stmt2.setInt(1, 1);
				stmt2.setDouble(2, 3.5);
				stmt2.executeUpdate();
				
				stmt2.setInt(1, 1);
				stmt2.setDouble(2, 4.7);
				stmt2.executeUpdate();
			}
		}
	}
}
