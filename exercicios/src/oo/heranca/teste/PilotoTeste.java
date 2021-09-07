package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class PilotoTeste {

	public static void main(String[] args) {

		// faz o Fusca acelerar
		Fusca fuscaoPreto = new Fusca();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		fuscaoPreto.acelerar();
		// boolean velocidadeFusca = fuscaoPreto.acelerar();

		// mostra a velocidade do Fusca
		System.out.println("vai Fuscão Preto feito de aço! " + fuscaoPreto.velocidadeAtual);

		// faz a Ferrari acelerar
		Ferrari ferrariModena = new Ferrari();
		ferrariModena.ligarTurbo();
		ferrariModena.ligarAr();
		ferrariModena.acelerar();
		ferrariModena.acelerar();
		ferrariModena.acelerar();
		ferrariModena.desligarAr();
		
		System.out.println(ferrariModena.velocidadeDoAr());
		
		ferrariModena.acelerar();
		ferrariModena.acelerar();
		ferrariModena.acelerar();
		ferrariModena.acelerar();
		// boolean velocidadeFerrari = ferrariModena.acelerar();

		// mostra a velocidade Ferrari
		System.out.println("Zuuummmmm " + ferrariModena.velocidadeAtual);

	}

}
