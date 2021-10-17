package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro(10, 12);

		Heroi heroi = new Heroi(10, 11);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		//monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

	}

}
