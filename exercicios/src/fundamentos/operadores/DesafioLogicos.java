package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		boolean trabalho1 = true;
		boolean trabalho2 = false;

		boolean sorvete = false;
		boolean maisSaudavel = false;

		if (trabalho1 && trabalho2) {
			sorvete = true;
			System.out.println("deu tudo certo consegui os dois trabalhos, bora pegar a TV de 50 " + sorvete);

		} else if (trabalho1 || trabalho2) {
			sorvete = true;
			System.out.println("Não foi dessa vez pessoal, bora pegar a TV de 32 " + sorvete);

		} else if (trabalho1 ^ trabalho2) {
			sorvete = true;
			System.out.println("Não deu nada certo, bora ver Netflix na nossa TV de tubo " + sorvete);

		} else if (!trabalho1 || !!trabalho2) {
			maisSaudavel = true;
			sorvete = false;
			System.out.println("que doideira " + maisSaudavel + " " + sorvete);
		}
	}
}
