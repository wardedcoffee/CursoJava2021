package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0;
		
		Produto p3 = new Produto("Calcinha Preta", 1000);
		
		
		Produto.desconto = 0.50; // está acessando e sobrepondo o valor de desconto na Produto.java
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		System.out.println(p3.nome + " " + p3.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto();
		
		/*
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.println(precoFinal3);
		*/
		
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
