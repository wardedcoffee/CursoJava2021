package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class VerificaPar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 10");
		int num;
		num = entrada.nextInt();
		
		if (num >= 0 && num <= 10 && (!(num % 2 == 1))) {
			System.err.println("É um número entre 0 e 10 e é par!");
		} else {
			System.out.println("não é um número par");
		}

		entrada.close();
	}

}
