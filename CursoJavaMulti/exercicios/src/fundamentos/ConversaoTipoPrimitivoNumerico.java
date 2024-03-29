package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888; // explícita (CAST)
		System.out.println(b);
		
		int c = 340; // o limite do byte é 127, depois disso o valor é bem diferente
		// não usar no mundo real, jogar algo maior dentro de algo menor.
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.0;
		int f = (int) e;
		System.out.println(f); // explícita (CAST)
		
		// preferência para 'int' e 'double' para evitar ao máximo o CAST.
	}
}
