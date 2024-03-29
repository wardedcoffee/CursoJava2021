package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		// int a = 3 * 4 - 10;
		// fazendo um CAST pra forçar um resultado inteiro já que a classe Math com
		// power retorna um valor double
		// int b = (int) Math.pow(a, 3);
		// double c = Math.pow(a, 3);

		// System.out.println(b);
		// System.out.println(c);

		// bloco esquerdo
		int adicao = 3 + 2;
		int seis = adicao * 6;
		// System.out.println(seis);

		double quadrado = Math.pow(seis, 2);
		// System.out.println(quadrado);

		int chaveInferior = 3 * 2;

		double primeiroResultado = quadrado / chaveInferior;
		// System.out.println(primeiroResultado);

		// bloco direito
		int five = 1 - 5;
		int seven = 2 - 7;
		int plus = five * seven;
		double barraDois = plus / 2;
		barraDois = Math.pow(barraDois, 2);
		// System.out.println(barraDois);

		// caixa azul
		double chaveSuperior = primeiroResultado - barraDois;
		System.out.println(chaveSuperior);

		double cinquentaElevado = Math.pow(chaveSuperior, 3);
		System.out.println(cinquentaElevado);

		// dez elevado a 3
		double dezElevado = Math.pow(10, 3);
		System.out.println(dezElevado);

		// cinquenta elevado a 3 dividido por dez elevado a 3
		double finalResult = cinquentaElevado / dezElevado;
		System.out.println(finalResult);

	}
}
