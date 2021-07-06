package fundamentos.exercicios;

public class Temperatura2 {

	public static void main(String[] args) {
	
		//(0 °C × 9/5) + 32 = 32 °F
		double celsius2 = 30;
		final double AJUSTE2 = 32;
		final double FATOR2 = 9.0 / 5;
		double fahrenheit2 = 0;
		
		
		fahrenheit2 = (celsius2 * FATOR2) + AJUSTE2;
		System.out.println("O resultado é " + fahrenheit2 + "°F.");
		

		// command + c 'copia algo'
		// command + v 'cola algo'
		// alt + seta pra 'cima ou pra baixo'
		// command + alt + seta pra 'cima ou pra baixo' copia a linha
	}

}
