package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("infito");
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
		}

		entrada.close();

		/*
		 * System.out.println("Digite iniciar para começar o programa"); String init;
		 * init = entrada.nextLine(); //String enquanto = 0;
		 * 
		 * String inicio = "inicio"; "inicio".equalsIgnoreCase(init);
		 * 
		 * 
		 * String out = entrada.nextLine(); //"sair".equalsIgnoreCase(out);
		 * //System.out.println(init);
		 * 
		 * 
		 * while (init.equalsIgnoreCase(inicio)) { System.out.println("Estou aqui!");
		 * 
		 * 
		 * }
		 * 
		 * 
		 *
		 * 
		 */

	}

}
