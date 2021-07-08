package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class NotasAluno {

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
		
		double media = nota1 + nota2 / 2;
		System.out.println("\n\nA média das notas é: " + media);
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
		
		

		entrada.close();
	}

}
