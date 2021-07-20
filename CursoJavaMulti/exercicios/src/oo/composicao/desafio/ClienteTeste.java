package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";

		// Nova compra ou o imput inicial, vai para Produto?
		Produto produto1 = new Produto("caixa de leite", 100);
		Item item1 = new Item(6);
		double total1 = produto1.preco * item1.quantidade;
		System.out.println("---->" + total1);
		
		
		Produto produto2 = new Produto("sabão", 10);
		Item item2 = new Item(3);
		double total2 = produto2.preco * item2.quantidade;
		System.out.println("---->" + total2);

 		

		//Produto produto3 = new Produto("pimenta", 13);


	}

}
