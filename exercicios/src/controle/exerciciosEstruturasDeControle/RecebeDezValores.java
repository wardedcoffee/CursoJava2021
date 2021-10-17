package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class RecebeDezValores {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = 0;
		nota1 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota1);
		
		System.out.println("\nDigite a segunda nota");
		double nota2 = 0;
		nota2 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota2);
		
		System.out.println("\nDigite a segunda nota");
		double nota3 = 0;
		nota3 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota3);
		System.out.println("\nDigite a terceira nota");
		
		double nota4 = 0;
		nota4 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota4);
		System.out.println("\nDigite a quarta nota");
		
		double nota5 = 0;
		nota5 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota5);
		System.out.println("\nDigite a quinta nota");
		
		double nota6 = 0;
		nota6 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota6);
		System.out.println("\nDigite a sexta nota");
		
		double nota7 = 0;
		nota7 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota7);
		System.out.println("\nDigite a sétima nota");
		
		double nota8 = 0;
		nota7 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota8);
		System.out.println("\nDigite a oitava nota");
		
		double nota9 = 0;
		nota7 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota9);
		System.out.println("\nDigite a nona nota");
		
		double nota10 = 0;
		nota7 = entrada.nextDouble();
		System.out.println("a nota digitada foi " + nota10);
		System.out.println("\nDigite a nona nota");
		
				
		double media = nota1 + nota2 / 2;
		System.out.println("\n\nA média das notas é: " + media);
		
		entrada.close();

	}

}
