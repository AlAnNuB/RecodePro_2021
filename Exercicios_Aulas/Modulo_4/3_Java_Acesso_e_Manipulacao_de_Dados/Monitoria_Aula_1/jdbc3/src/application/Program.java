package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from Pessoa");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Nome"));
			}
			
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			DB.closeConnection();
		}
	}
}
