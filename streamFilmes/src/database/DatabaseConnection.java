package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static String url;
	public static String username;
	public static String password;
	
	public DatabaseConnection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public static Connection getConnection() throws SQLException{
		 return DriverManager.getConnection(url, username, password);
	}
	
	public void closeConnection(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			}catch (SQLException e) {
				System.err.println("Erro ao fechar a conexão do BD: " + e.getMessage());
			}
			
		}
	}
	
	
}
