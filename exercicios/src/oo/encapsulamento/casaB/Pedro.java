package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {

		// System.out.println(mae.segredo); privado
		// System.out.println(mae.facoDentroDeCasa); pacote
		System.out.println(formaDeFalar); // tem que acessar diretamente via herança - extends
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);

	}

}
