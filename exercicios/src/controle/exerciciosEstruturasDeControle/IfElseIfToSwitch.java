package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class IfElseIfToSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
			case 5:
			nota = 10;
			break;
			case 4:
			nota = 7;
			break;
			case 3:
			nota = 4;
			break;
			case 2:
			nota = 3;
			case 1:
			nota = 1;
			default:
			System.out.println("Reprovado");
			
		}
		
		/*
		* 
		* } case 4: { nota >= 8.1; System.out.println("Conceito A");
		* System.out.println("Parabéns!!!"); } } else if (nota >= 6.1) {
			* System.out.println("Conceito B"); } else if (nota >= 4.1) {
				* System.out.println("Conceito C"); } else if (nota >= 2.1) {
					* System.out.println("Conceito D"); } else { System.out.println("Conceito E");
					* }
					* 
					*/
					// System.out.println("Nota inválida!");
					System.out.println("Fim!");
					entrada.close();
				}
			}
			