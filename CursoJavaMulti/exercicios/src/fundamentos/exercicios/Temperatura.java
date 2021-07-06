package fundamentos.exercicios;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		// Var const const var

		double fahrenheit = 86;
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		double celsius = 0;

		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");

		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		// command + c 'copia algo'
		// command + v 'cola algo'
		// alt + seta pra 'cima ou pra baixo'
		// command + alt + seta pra 'cima ou pra baixo' copia a linha
	}

}
