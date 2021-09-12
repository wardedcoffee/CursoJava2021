package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5; // declaraÁ„o e inicializaÁ„o
		System.out.println(a);

		a = 12; // double para int ele aceita?
		System.out.println(a);

		// a = "...";

		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);

		// c = 4.5;

		double d; // vari√°vel foi declarada
		d = 123.65; // vari√°vel foi inicializada
		System.out.println(d); // usada!

		// var e; n√£o √© poss√≠vel declarar uma var e inicializar em outra linha
		// e = 123.45;

		var f = 12; // inteiro
		/*
		 * f = 12.01; Error: Type mismatch: cannot convert from double to int √© poss√≠vel
		 * converter de double para int!!
		 */
		System.out.println(f);
	}
}
