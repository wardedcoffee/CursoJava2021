package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// Domingo > 1
		// quarta > 4
		// terça >
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um dia da semana");
		String diaSemana;
		diaSemana = entrada.nextLine();
		// System.out.println(diaSemana);

		String domingo = "domingo";
		String segunda = "segunda";
		String terca = "terça";
		String quarta = "quarta";
		String quinta = "quinta";
		String sexta = "sexta";
		String sabado = "sábado";

		if (diaSemana.equals(domingo)) {
			System.out.println("1");
		} else if (diaSemana.equals(segunda)) {
			System.out.println("2");
		} else if (diaSemana.equals(terca)) {
			System.out.println("3");
		} else if (diaSemana.equals(quarta)) {
			System.out.println("4");
		} else if (diaSemana.equals(quinta)) {
			System.out.println("5");
		} else if (diaSemana.equals(sexta)) {
			System.out.println("6");
		} else if (diaSemana.equals(sabado)) {
			System.out.println("7");
		}

		entrada.close();

	}

}
