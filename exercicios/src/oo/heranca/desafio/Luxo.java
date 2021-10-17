package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();

	void desligarAr();
	
	// implementação default sem precisar chamar na Ferrari
	default int velocidadeDoAr() {
		return 1;
	}
	
	

}
