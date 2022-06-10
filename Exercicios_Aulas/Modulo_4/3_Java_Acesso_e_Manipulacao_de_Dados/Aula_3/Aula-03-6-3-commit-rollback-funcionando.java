package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/recode";

		try (Connection conn = DriverManager.getConnection(url, "root", "root")) {
			System.out.println("Conectou no banco de dados!"); 

			String sql1 = "INSERT INTO PRODUTO (ID, NOME) VALUES (?, ?)";
			String sql2 = "INSERT INTO ITEM (PRODUTO_ID, PRECO) VALUES (?, ?)";

			try (PreparedStatement stmt1 = conn.prepareStatement(sql1);
				 PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
				
				conn.setAutoCommit(false);
				
				stmt1.setInt(1, 1);
				stmt1.setString(2, "Feijão");
				stmt1.executeUpdate();
				
				stmt2.setInt(1, 1);
				stmt2.setDouble(2, 3.5);
				stmt2.executeUpdate();
				
				Object o = null;
				o.toString();
				
				stmt2.setInt(1, 1);
				stmt2.setDouble(2, 4.7);
				stmt2.executeUpdate();
				
				conn.commit();
			}
		}
	}
}
