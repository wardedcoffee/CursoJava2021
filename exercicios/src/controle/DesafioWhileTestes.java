package controle;

import java.util.Scanner;

public class DesafioWhileTestes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		double num = 0;

		// total < 50 // aprimorar a lógica do while
		// num != -1 && num >= 0 && num <= 10
		while (num != -1) {

			System.out.printf("Total = %d\n", total);
			System.out.printf("Entre com um numero: ");
			num = entrada.nextDouble();

			if (num < 0 && num > 10) {
				System.out.println("Sorria vc esta sendo filmado");
			} else {

				total += num;

			}



			// 0 - 10 nota valida.
			// if (!(imc >= 30) || (imc < 29.9))
			//if (!(num >= 0 && num <= 10)) {
				//System.out.println("é uma nota inválida10");
				
			//}

			/*
			 * else { System.out.
			 * println("esta nota não é válida, por favor insira um número entre 0 e 10"); }
			 */

		}

		System.out.printf("Final total = %d\n", total);

		entrada.close();

	}

}
