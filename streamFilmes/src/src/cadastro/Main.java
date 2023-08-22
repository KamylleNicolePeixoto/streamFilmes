package src.cadastro;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.forLanguageTag("pt-BR"));
		ArrayList<Filme> filmes = new ArrayList<>();
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
				System.out.print("Digite o t tulo do filme: ");
				scanner.nextLine(); // Limpar o buffer
				String titulo = scanner.nextLine();

				System.out.print("Digite o ano do filme: ");
				int ano = scanner.nextInt();

				System.out.print("Digite a avalia  o do filme: ");
				double avaliacao = scanner.nextDouble();

				filmes.add(new Filme(titulo, ano, avaliacao));
				System.out.println("Filme cadastrado com sucesso!");
				break;
			case 2:
				if (filmes.isEmpty()) {
					System.out.println("Nenhum filme cadastrado");
				} else {
					System.out.println("Filmes cadastrados: ");
					for (Filme filme : filmes) {
						System.out.println("\nTítulo: " + filme.getTitulo() + "\nAno: " + filme.getAno() + "\nAvalia  o: "
								+ filme.getAvaliacao() );
					}
				}
				break;
			case 3:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Op  o inválida. Escolha novamente.");
			}
		} while (opcao != 3);
		scanner.close();
	}
}
