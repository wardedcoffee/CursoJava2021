package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class VerificaPar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número entre 0 e 10");

		int num = entrada.nextInt();

		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.err.println("O número " + num + " está entre 0 e 10 e é um par!");
			} else {
				System.out.println("O número " + num + " está entre 0 e 10 mas não é um par.");
			}

		} else {
			System.out.println("O número " + num + " não está entre 0 e 10.");
		}

		entrada.close();
	}

}
