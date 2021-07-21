package oo.heranca.desafio;

public class Ferrari extends Carro {

	boolean acelerar() {

		velocidadeAtual += 15;

		return true;
	}
	
	// frear
	boolean frear() {

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
