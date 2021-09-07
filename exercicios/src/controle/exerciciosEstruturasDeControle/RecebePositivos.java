package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class RecebePositivos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		double num = 0;

		// alterar a lógica do while para encerrar com qualquer negativo
		// 	while (num != -1) {
		while (num != -10000000) {

			System.out.printf("Total = %d\n", total);
			System.out.printf("Entre com um numero: ");
			num = entrada.nextDouble();

			// if (num < 0 && num > 10) {
			if (num > 0) {
				total += num;
			} else {
				System.out.println("Sorria vc esta sendo filmado");
				break;

			}

		}

		System.out.printf("Final total = %d\n", total);

		entrada.close();

	}

}
