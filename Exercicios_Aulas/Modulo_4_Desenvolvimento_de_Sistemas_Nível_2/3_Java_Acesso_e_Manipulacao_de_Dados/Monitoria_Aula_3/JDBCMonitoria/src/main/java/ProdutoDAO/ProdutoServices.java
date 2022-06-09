package ProdutoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoServices {

	public void save(String nome, float valor) {
		String sql = "INSERT INTO produto (NOME, VALOR) VALUES(? , ?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, nome);
			pstm.setFloat(2, valor);
			pstm.execute();
			System.out.println("Cadastrado com sucesso");
			pstm.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void update(int Id, String nome, float valor) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement("UPDATE produto set Nome = ?, Valor = ? WHERE ID = ?");
			pstm.setString(1, nome);
			pstm.setFloat(2, valor);
			pstm.setInt(3, Id);
			pstm.execute();
			System.out.println("Atualizado com sucesso");
			pstm.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void getProdutos() {
		String sql = "SELECT * FROM produto";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet resultSet = null;
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			resultSet = pstm.executeQuery();
			while (resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Nome: " + resultSet.getString("nome"));
				System.out.println("Valor: " + resultSet.getFloat("valor"));
				System.out.println();
			}
			conn.close();
			pstm.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}