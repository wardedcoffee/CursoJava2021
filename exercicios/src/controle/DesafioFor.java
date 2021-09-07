package controle;

public class DesafioFor {

	public static void main(String[] args) {

		/*
		 * String valor = "#"; for(int i = 1; i <= 5; i++) { System.out.println(valor);
		 * valor += "#"; }
		 */

		String hashtag = "#";
		// for(hashtag = "#"; hashtag.equals("#") ; hashtag = "#####")
		for (hashtag = "#"; hashtag.equals("#"); hashtag = "#####") {
			System.out.println(hashtag);
			for (hashtag = "##"; hashtag.equals("##"); hashtag = "#####") {
				System.out.println(hashtag);
				for (hashtag = "###"; hashtag.equals("###"); hashtag = "#####") {
					System.out.println(hashtag);
					for (hashtag = "####"; hashtag.equals("####"); hashtag = "#####") {
						System.out.println(hashtag);
						// hashtag += "#";

					}

				}

			}
		}

		System.out.println(hashtag);
		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!

	}

}
