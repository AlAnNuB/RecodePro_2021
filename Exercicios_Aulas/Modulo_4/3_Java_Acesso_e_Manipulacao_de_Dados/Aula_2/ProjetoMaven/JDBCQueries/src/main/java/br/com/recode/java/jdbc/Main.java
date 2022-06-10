package br.com.recode.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {

		/*
		 * //String de conexão String url = "jdbc:mysql://localhost:3306/recode";
		 * 
		 * //Criando a conexão Connection conn = DriverManager.getConnection(url,
		 * "fsuser", "Pass123!");
		 * System.out.println("Conectou no banco de dados com sucesso!");
		 * 
		 * //Fechar conexão com o banco conn.close();
		 */
		
		// String de conexão
		String url = "jdbc:mysql://localhost:3306/recode";

		try (/* Criando a conexão */Connection conn = DriverManager.getConnection(url, "fsuser", "Pass123!")) {
			System.out.println("Conectou no banco de dados com sucesso!");

			String sql = "INSERT INTO produto (NOME, VALOR) VALUES ('Caderno', 17.95)";

			// Cria a variavel de manipulação do banco de dados - Como vai fazer a
			// manipulação
			try (Statement stmt = conn.createStatement()) {
				stmt.executeUpdate(sql);
				System.out.println("Produto inserido com sucesso");

				// Fechar conexão com o banco
				conn.close();
			}
		}

	}

}
