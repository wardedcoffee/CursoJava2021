package controle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			// esse if só mostra números pares
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			if(i == 5) continue; // aqui ele pula o 5
			System.out.println(i);
		}
	}

}
