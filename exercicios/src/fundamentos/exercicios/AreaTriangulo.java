package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		
		//insira o valor separado por ,
		System.out.println("Insira o valor base: ");
		base = entrada.nextDouble();
		
		System.out.println("Insira o valor da altura: ");
		altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		entrada.close();

	}

}
