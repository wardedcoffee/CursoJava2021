package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class AnoCopa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		
		// int anoAtual = 0;
		// anoAtual = entrada.nextInt();

		System.out.println("Entre com a data limite");
		int limite;
		limite = entrada.nextInt();

		int anoCopa = 1930;

		while (anoCopa <= limite) {
			System.out.println("Teve copa em " + anoCopa);
			anoCopa = anoCopa + 4;

		}
		System.out.println("FIM");

				
		entrada.close();

	}

}
