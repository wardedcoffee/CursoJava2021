package controle.exerciciosEstruturasDeControle.respostas;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um número: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;

		} while (contador != 10);

		System.out.println("O maior valor foi: " + maiorValor);

		scanner.close();
	}

}
