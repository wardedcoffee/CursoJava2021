package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(150);

	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima = 300);
		delta = 15;

	}

	// acelerar Ferrari com limite de 200
	
	 public boolean acelerar() {
	
		velocidadeAtual += 15;
		System.out.println("Ferrari " + velocidadeAtual);

		return true;
	}

	// frear
	public boolean frear() {

		// barra frear negativo
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 15;

		} else {
			System.out.println(
					"não foi possível frear seu carro abaixo de zero, " + "por favor saia do lugar e tente novamente");

		}

		return false;

	}

}
