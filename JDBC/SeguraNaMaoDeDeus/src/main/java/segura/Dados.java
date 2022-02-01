package segura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Dados {

		Scanner scan = new Scanner(System.in);

		public void Cadastrar(String nome, String cpf, int viagem) {
			
			String sql = "INSERT INTO Clientes(Nome, CPF, IdViagens) VALUES (?, ?, ?)";
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = Programa.createConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, nome);
				pstm.setString(2, cpf);
				pstm.setInt(3, viagem);
				pstm.execute();
				System.out.println("Cadastrado com sucesso!");
				pstm.close();
				conn.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		public void Consulta() {
			String sql = "SELECT * FROM Clientes inner join Viagens on Clientes.IdViagens = Viagens.IdViagens";
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			try {
				conn = Programa.createConnection();
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while (rs.next()) {
					System.out.println("ID: " + rs.getInt("IdCliente"));
					System.out.println("Nome: " + rs.getString("Nome"));
					System.out.println("CPF: " + rs.getString("CPF"));
					System.out.println("Destino: " + rs.getString("Destinos"));
					System.out.println("Data Ida: " + rs.getDate("Ida"));
					System.out.println("Preço: " + rs.getDouble("Preco"));
					System.out.println();
				}
				conn.close();
				pstm.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}

		public void Deletar(int id) {
			String sql = "DELETE FROM Clientes WHERE IdCliente = ?";
			Connection conn = null;
			PreparedStatement pstm = null;
			try {
				conn = Programa.createConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.execute();
				System.out.println("Compra cancelada!");
				pstm.close();
				conn.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		public void Atualizar(int idcliente, String nome, String cpf, int viagem) {
			String sql = "UPDATE Clientes SET Nome = ?, CPF = ?, IdViagens = ?  WHERE IdCliente = ?";
			Connection conn = null;
			PreparedStatement pstm = null;
			try {
				conn = Programa.createConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(4, idcliente);
				pstm.setString(1, nome);
				pstm.setString(2, cpf);
				pstm.setInt(3, viagem);
				pstm.execute();
				System.out.println("Dados alterados com sucesso!");
				pstm.close();
				conn.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		public Scanner getScan() {
			return scan;
		}

		public void setScan(Scanner scan) {
			this.scan = scan;
		}

		public Dados(Scanner scan) {
			super();
			this.scan = scan;
		}

		public Dados() {
			super();
		}

		

	}

