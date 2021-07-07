package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// calcular media das notas de uma turma de alunos

		Scanner entrada = new Scanner(System.in);

		/*
		int contador = 0;

		while (contador <= 20) {
			System.out.printf("i = %d\n", contador);
			// contador++;
			contador += 2;
		}*/

		// Logica com numeros e total
		int notaValida = 0;
		System.out.println("Por favor digite uma nota de 0 a 10.");
		while (notaValida <= 100) {
			System.out.printf("i = %d\n", notaValida);
			notaValida++;
		}
		
		System.out.println("Esse é o seu total " + notaValida);

		
		
		//String notaValida = "0";

		//while (!notaValida.equalsIgnoreCase("-1")) {
			
			/*
			double notaInt = Double.parseDouble(notaValida);  
			
			
			double teste = notaInt + 10;
			
			System.out.println(teste);*/
			
			/*
			if (notaInt >= 0 && notaInt <= 10) {
				System.out.println("é uma nota maior que 0");
			} else {
				System.out.println("esta nota não é válida, por favor insira um número entre 0 e 10");
			}
			*/
			
			
			/*
			// estrutura while com String
			System.out.println("Por favor digite uma nota de 0 a 10.");
			System.out.print("Você diz: ");
			notaValida = entrada.nextLine();
			*/
			
			
		
	
	
		
		
		
		
		
		
		
		
		/*
		notaValida = entrada.nextInt();
		System.out.println(notaValida);

		// 0 - 10 nota valida.
		if (notaValida >= 0 && notaValida <= 10) {
			System.out.println("é uma nota maior que 0");
		} else {
			System.out.println("esta nota não é válida, por favor insira um número entre 0 e 10");
		}

		int total = 0;

		int exit = -1;
		while (notaValida != exit) {

		}*/
		
		
		// armazenar um nota VALIDA numa variavel chamada TOTAL

		// var notasVALIDAS armazena quantas notas validas foram digitadas

		// para finalizar somente com -1, se digitar uma nota inválida, avisar o
		// usuário.
	
	     

		entrada.close();
  
	}

}
