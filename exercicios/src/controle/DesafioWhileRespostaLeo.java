package controle;

import java.util.Scanner;

public class DesafioWhileRespostaLeo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// inicialização das variáveis
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		// loop WHILE com uma condição IF e ELSE IF - double media
		// pega os valores fora do loop e calcula a média
		while (nota != -1) {
			System.out.println("Informe a nota: ou -1 p/ sair: ");
			nota = entrada.nextDouble();

			// verifica se a nota é válida
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!! ;D");
			}

		}

		// Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();

	}

}
