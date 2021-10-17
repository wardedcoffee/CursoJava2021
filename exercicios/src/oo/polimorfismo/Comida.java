package oo.polimorfismo;

public abstract class Comida {

	private double peso;

	// faltou trazer as caracteristicas das comidas e passar os valores como herança

	// Super Classe
	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;

		}

	}

}
