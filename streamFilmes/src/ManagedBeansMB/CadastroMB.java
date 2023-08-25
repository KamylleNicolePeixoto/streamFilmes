package ManagedBeansMB;

import java.sql.Connection;
import java.util.Scanner;

import objetos.Filme;

public class CadastroMB {
	
	private Connection connection;
	
	public CadastroMB(Connection connection) {
		this.connection = connection;
	}
	
	public void cadastrarFilmes(Scanner scanner) {
		scanner.nextLine(); // Limpar o buffer

		System.out.print("Digite o título do filme: ");
		String titulo = scanner.nextLine();

		System.out.print("Digite o ano do filme: ");
		int ano = scanner.nextInt();

		System.out.print("Digite a avalia  o do filme: ");
		double avaliacao = scanner.nextDouble();
		
		String sql = "INSERT INTO tb_filmes (titulo, ano, avaliacao) VALUES (?, ?, ?)";
        try {
	}

}
