package fundamentos.exercicios;

public class CalculadoraIMC {

	public static void main(String[] args) {

		String nome = "Melvin";
		int peso = 65;
		double altura = 1.70;

		double imc = peso / (altura * altura);

		if (!(imc >= 30) || (imc < 29.9)) {
			System.out.printf("%s você não está acima do peso", nome);
		} else {
			System.out.printf("%s você está acima do peso", nome);
		}

		System.out.printf("\nO índice é igual a: %.2f ", imc);

	}

}
