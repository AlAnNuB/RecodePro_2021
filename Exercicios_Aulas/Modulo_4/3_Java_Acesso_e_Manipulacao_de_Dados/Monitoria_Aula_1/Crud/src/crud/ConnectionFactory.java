package crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/crud";
	
	private static String USER = "fsuser";
	
	private static String PASSWORD = "Pass123!";
	
	public static Connection createConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn = createConnection();
		
		if(conn != null) {
			System.out.println("Connexão obtida com sucesso");
		}else {
			System.out.println("Erro ao connectar");
		}
	}
}
