package segura;

import java.sql.Connection;
import java.sql.DriverManager;

public class Programa {
	
	private static String url = "jdbc:mysql://localhost:3306/SeguraNaMaoDeDeus";
	private static String usuario = "fsuser";
	private static String senha = "Pass123!";
	
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = createConnection();
		if (conn != null) {
			System.out.println("Conexão obtida com sucesso");
		} else {
			System.out.println("Erro ao conectar");
		}

		Dados bd = new Dados();
		
		bd.Menu();
	
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Programa.url = url;
	}

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		Programa.usuario = usuario;
	}

	public static String getSenha() {
		return senha;
	}

	public static void setSenha(String senha) {
		Programa.senha = senha;
	}

	@Override
	public String toString() {
		return "Programa [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
