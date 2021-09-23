package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		// usar scanner pegar 3 strings nextln
		Scanner entrada = new Scanner(System.in);

		// essas 3 strings vao pegar a media dos ultimos 3 salários de uma pessoa
		System.out.print("Digite o seu nome ");
		String nome = entrada.nextLine();

		System.out.println("Digite seu salário atual ");
		String salarioAtual = entrada.nextLine();

		System.out.println("Digite seu salário do mês passado ");
		String salarioAnterior = entrada.nextLine();

		System.out.println("Digite seu salário do mês retrasado ");
		String salarioRetrasado = entrada.nextLine();

		salarioAtual = salarioAtual.replaceAll(",", ".");
		salarioAnterior = salarioAnterior.replaceAll(",", ".");
		salarioRetrasado = salarioRetrasado.replaceAll(",", ".");
		
		double atual = Double.parseDouble(salarioAtual);
		double anterior = Double.parseDouble(salarioAnterior);
		double retrasado = Double.parseDouble(salarioRetrasado);
		System.out.println(salarioAtual);

		double soma = atual + anterior + retrasado;
		System.out.println("A soma dos 3 salários de " + nome + " é: " + soma);
		System.out.println("A média dos últimos 3 salários é: " + soma / 3);

		entrada.close();
		
		//DecimalFormat numeroFormatado = new DecimalFormat("##.##");
		
		
		// tem que funcionar com ponto e vírgula

	}
}