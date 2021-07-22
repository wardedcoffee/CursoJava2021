package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	
	  //jeito fácil de resolver
	public Carro() {
		this.VELOCIDADE_MAXIMA = 200;
		// TODO Auto-generated constructor stub
	}
	
	


	// acelerar
	public boolean acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			System.out.println(
					"não foi possível acelerar além de 200 Fuscão! por favor reduza a velocidade");
		} else {
			
			velocidadeAtual += delta;
			System.out.println("Fuscão Preto " + velocidadeAtual);
			
		}

		return true;
	}

	// frear
	public boolean frear() {

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
