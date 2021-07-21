package oo.heranca.desafio;

public class PilotoTeste extends Carro {

	public static void main(String[] args) {

		// faz o Fusca acelerar
		Fusca fuscaoPreto = new Fusca();
		boolean velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.frear();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		velocidadeFusca = fuscaoPreto.acelerar();
		
		
		
		// mostra a velocidade do Fusca
		System.out.println("vai Fuscão Preto feito de aço! " + fuscaoPreto.velocidadeAtual);

		// faz a Ferrari acelerar
		Ferrari ferrariModena = new Ferrari();
		boolean velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
		velocidadeFerrari = ferrariModena.acelerar();
	/*
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.acelerar();
		
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		velocidadeFerrari = ferrariModena.frear(); // zero?
		*/
		// velocidadeFerrari = ferrariModena.acelerar();
		// velocidadeFerrari = ferrariModena.acelerar();
		// velocidadeFerrari = ferrariModena.acelerar();
		

		// mostra a velocidade Ferrari
		System.out.println("Zuuummmmm " + ferrariModena.velocidadeAtual);

	}

}
