package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -40);
		p1.setIdade(300); // alterar

		System.out.println(p1.getIdade()); // ler
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
	}
}
