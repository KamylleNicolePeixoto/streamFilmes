package principal;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import ManagedBeansMB.CadastroMB;
import database.DatabaseConnection;
import objetos.Filme;

public class Main {
	
	private static Connection connection;
	private static DatabaseConnection dbConnection;
	private static Filme filme; 
	private static CadastroMB cadastroMB;

	public static void main(String[] args) {
		onInit();
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.forLanguageTag("pt-BR"));
		int opcao = 0;

		do {
			System.out.println("""
					\n\nMenu

					1- Cadastrar Filme
					2- Listar Filmes
					3- Sair
					Escolha uma op  o
					""");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				cadastroMB.cadastrarFilmes(scanner);				
				break;
			case 2:
				//Listar filmes
				break;
			case 3:
				System.out.println("Saindo do programa.");
				if(connection != null) {
					dbConnection.closeConnection(connection);
				}
				break;
			default:
				System.out.println("Opçãoo inválida. Escolha novamente.");
			}
		} while (opcao != 3);
		scanner.close();
	}
	
	private static void onInit() {
		String url = "jdbc:postgresql://localhost:5432/streamfilmes";
		String username = "postgres";
		String password = "root";

		dbConnection = new DatabaseConnection(url, username, password);
		connection = null;
		
		try {
			 connection = dbConnection.getConnection();
			System.out.println("Conexão bem-sucedida!");
			// Agora você tem a conexão e pode continuar a implementar outras
			// funcionalidades.
		} catch (SQLException e) {
			System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
		} 
	}

}
