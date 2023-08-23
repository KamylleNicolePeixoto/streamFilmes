package cadastro;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filme {
	private String titulo;
	private int ano;
	private double avaliacao;
	
	public Filme(String titulo, int ano, double avaliacao) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.avaliacao = avaliacao;
				
	}
}
