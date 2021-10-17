package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 1.780);
		Comida c2 = new Comida("Feijão", 0.350);
		Comida c3 = new Comida("Batata", 8.450);

		Pessoa p1 = new Pessoa("Melvin", 120);

		// System.out.println("Peso antes de comer " + p1.peso);

		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c3);
		System.out.println(p1.apresentar());

		// p1.comer(c2);
	}

}
