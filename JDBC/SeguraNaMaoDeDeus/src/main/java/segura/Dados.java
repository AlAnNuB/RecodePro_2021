package segura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Dados {

		Scanner scan = new Scanner(System.in);
		
		public void Menu() {
			int resp = 0;

			do {
				System.out.println("------------------------------------------------");
				System.out.println("Seja Bem Vindo a Viagens Segura Na Mao De Deus");
				System.out.println("------------------------------------------------");
				System.out.println("Selecione uma de nossas opções: ");
				System.out.println("( 1 ) - Comprar");
				System.out.println("( 2 ) - Consultar compras");
				System.out.println("( 3 ) - Atualizar compras");
				System.out.println("( 4 ) - Remover compras");
				System.out.println("( 5 ) - Encerrar o programa");
				System.out.println("------------------------------------------------");

				resp = scan.nextInt();

				if (resp == 1) {
					System.out.println("------------------------------------------------");
					System.out.println("Digite o seu nome: ");
					scan.skip("((?<!\\R)\\s)*");
					String Nome = scan.nextLine();
					System.out.println("------------------------------------------------");
					System.out.println("Digite o seu CPF: ");
					String CPF = scan.next();
					scan.skip("((?<!\\R)\\s)*");
					System.out.println("------------------------------------------------");
					System.out.println("Escolha uma das viagens:(1 a 13)");
					System.out.println("------------------------------------------------");
				    System.out.println("1 - Alagoas ida: 29/04/2022 Preço: R$ 3.280,00");
				    System.out.println("2 - Amazonas ida: 29/03/2022 preco: R$ 4.470,00");
				    System.out.println("3 - Ceará ida: 25/02/2022 preco: R$8.753,00");
				    System.out.println("4 - Florianopolis ida: 14/05/2022 preco: R$3.953,00");
				    System.out.println("5 - Goias ida: 29/04/2022 preco: R$5.370,00");
				    System.out.println("6 - Minas Gerais ida: 26/10/2022 preco: R$9.470,00");
				    System.out.println("7 - Paraiba ida: 03/04/2022 preco: R$2.470,00");
				    System.out.println("8 - Pernambuco ida: 05/12/2022 preco: R$4.693,00");
				    System.out.println("9 - Rio Grande do Norte ida: 05/11/2022 preco: R$5.853,00");
				    System.out.println("10 - Rio Grande do Sul ida: 30/10/2022 preco: R$6.824,00");
				    System.out.println("11 - Rio de Janeiro ida: 29/04/2022 preco: R$1.853,00");
				    System.out.println("12 - Salvador ida: 15/06/2022 preco: R$5.268,00");
				    System.out.println("13 - Tocantins ida: 13/06/2022 preco: R$5.196,00");
				    System.out.println("------------------------------------------------");
				    int Viagem = scan.nextInt();
				    scan.skip("((?<!\\R)\\s)*");
				    Cadastrar(Nome, CPF, Viagem);
				}else
				if (resp == 2) {
					Consulta();
				}else
				if (resp == 3) {
					System.out.println("------------------------------------------------");
					System.out.println("Digite o ID da compra que deseja alterar:");
					int ID = scan.nextInt();
					System.out.println("------------------------------------------------");
					System.out.println("Digite o novo nome:");
					scan.skip("((?<!\\R)\\s)*");
					String Nome = scan.nextLine();
					System.out.println("------------------------------------------------");
					System.out.println("Digite o CPF correto:");
					String CPF = scan.next();
					System.out.println("------------------------------------------------");
					System.out.println("Digite o codigo de cadastro da viagem: (1 a 13)");
					int Viagem = scan.nextInt();
					Atualizar(ID, Nome, CPF, Viagem);
				}else
				if (resp == 4) {
					System.out.println("------------------------------------------------");
					System.out.println("Digite o ID da compra para cancelar!");
					System.out.println("------------------------------------------------");
					int ID = scan.nextInt();
					Deletar(ID);
				}else
				if (resp == 5) {
					System.out.println("------------------------------------------------");
					System.out.println("Obrigado por usar nosse serviços!");
					System.out.println("E nao se esqueça! Viagens Segura Na Mao De Deus");
					System.out.println("------------------------------------------------");
					break;
				}

			}while(resp != 5);
			
			scan.close();
		}

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
				System.out.println("------------------------------------------------");
				System.out.println("Cadastrado com sucesso!");
				System.out.println("------------------------------------------------");
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
					System.out.println("------------------------------------------------");
					System.out.println("ID: " + rs.getInt("IdCliente"));
					System.out.println("Nome: " + rs.getString("Nome"));
					System.out.println("CPF: " + rs.getString("CPF"));
					System.out.println("Destino: " + rs.getString("Destinos"));
					System.out.println("Data Ida: " + rs.getDate("Ida"));
					System.out.println("Preço: " + rs.getDouble("Preco"));
					System.out.println("------------------------------------------------");
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
				System.out.println("------------------------------------------------");
				System.out.println("Compra cancelada com sucesso!");
				System.out.println("------------------------------------------------");
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
				System.out.println("------------------------------------------------");
				System.out.println("Dados alterados com sucesso!");
				System.out.println("------------------------------------------------");
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

