package fundamentos.exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double base = 0;
		double expoente = 0;

		// só funciona com vírgula; ex: 2,5
		System.out.println("Insira o valor da base: ");
		base = entrada.nextDouble();

		System.out.println("Insira o valor do expoente: ");
		expoente = entrada.nextDouble();

		double resultado = Math.pow(base, expoente);
		System.out.println("O resultado da potenciação é " + resultado);

		entrada.close();

	}

}
