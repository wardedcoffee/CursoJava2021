package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	
	  //jeito fácil de resolver
	public Carro() {
		this.VELOCIDADE_MAXIMA = 200;
		
	}
	
	


	// acelerar
	public boolean acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			System.out.println(
					"não foi possível acelerar além de 200 Fuscão! por favor reduza a velocidade");
		} else {
			
			velocidadeAtual += getDelta();
			System.out.println("Velocidade atual do Fuscão Preto => " + velocidadeAtual + "Km/h.");
			
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


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
