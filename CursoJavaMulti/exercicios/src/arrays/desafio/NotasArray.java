package arrays.desafio;

import java.util.Scanner;

public class NotasArray {

	public static void main(String[] args) {

		// com um foreach o programa soma todas as notas e mostra ao usuario
		Scanner entrada = new Scanner(System.in);

		// usuario informa o numero de notas - o tamanho do array
		System.out.println("Quantas notas deseja inserir no sistema?");
		double notasAluno = entrada.nextDouble();

		double notasAluno2 = notasAluno;
		
		//double[] notasAlunos = { notasAluno2 };
		double[] notasAlunos = new double[(int) notasAluno2];

		// o programa pergunta: digite a nota 1, digite a nota 2...
		// cada nota assume uma posicao dentro do array

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println(notasAlunos[i]);
			

		}

		// cada nota armazenada no primeiro Array, passa pra esse foreach e é somada

		entrada.close();

	}

}
