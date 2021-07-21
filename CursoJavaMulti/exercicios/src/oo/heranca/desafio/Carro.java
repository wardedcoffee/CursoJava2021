package oo.heranca.desafio;

public class Carro {

	// velocidade atual
	int velocidadeAtual = 0;

	// acelerar
	boolean acelerar() {

		velocidadeAtual += 5;

		return true;
	}

	// frear
	boolean frear() {

		// barra frear negativo
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;

		} else {
			System.out.println(
					"não foi possível frear seu carro abaixo de zero, " + "por favor saia do lugar e tente novamente");

		}

		return false;

	}

}
