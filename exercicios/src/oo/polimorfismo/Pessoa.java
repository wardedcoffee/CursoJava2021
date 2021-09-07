package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}

	// método que contem os três ou o comer que contém todos
	/*
	 * Comida comida = new Comida(); Comida comidaX = new Comida(); Comida comiday =
	 * new Comida(); Comida comidaz = new Comida();
	 * 
	 * 
	 * 
	 * 
	 * public void comer() {
	 * 
	 * if (comidaX = Arroz) { this.peso } else if (comiday) {
	 * 
	 * } else if (comidaz) {
	 * 
	 * }
	 * 
	 * this.peso += comidaX.getPeso(); }
	 * 
	 * 
	 * public void comer(Feijao feijao) { this.peso += feijao.getPeso(); }
	 * 
	 * public void comer(Sorvete sorvete) { this.peso += sorvete.getPeso(); }
	 */
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
		
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
