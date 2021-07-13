package controle.exerciciosEstruturasDeControle.respostas;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um número para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O número " + numero + " é um número primo.");
			break;
		default:
			System.out.println("O número " + numero + " não é um número primo.");

		}

		scanner.close();

	}

}
