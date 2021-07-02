package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
	    double raio = 3.4;
	  //'final' torna a variável constante - nomes de constantes em letra maiúscula!
	    final double PI = 3.14159; 
	    
	    //pi = 1;
	    double area = PI * raio * raio;
	    
	    // syso + ctrl + barra
	    System.out.println(area);
	    
	    raio = 10;
	    area = PI * raio * raio;
	    System.out.println("Área = " + area + "m2.");
	    System.out.println("Área = " + area + "m2.");
	    System.out.println("Área = " + area + "m2.");
	    
	    // command + c 'copia algo'
	    // command + v 'cola algo'
	    // alt + seta pra 'cima ou pra baixo'
	    // command + alt + seta pra 'cima ou pra baixo' copia a linha 
	}
}
