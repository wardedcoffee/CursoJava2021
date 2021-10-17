package oo.heranca;

public class Monstro extends Jogador {
	
	// construtor padrão, o this chamando o construtor abaixo.
	public Monstro() {
		this(0, 0);
	}

	// construtor explícito, o super chamando o construtor padrão ou explícito da classe pai
	public Monstro(int x, int y) {
		super(x, y);
	}
}
