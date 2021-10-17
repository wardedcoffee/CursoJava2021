package arrays;

public class ForeachTeste {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		// System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		// System.out.println(Arrays.toString(notasAlunoA));
		// System.out.println(notasAlunoA[0]);
		// System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); tentou acessar um número fora dos limites
		// deste Array.

		for (double notasA : notasAlunoA) {
			System.out.println("Notas da turma A " + notasA);
		}

		/*
		 * for (int i = 0; i < notasAlunoA.length; i++) { totalAlunoA += notasAlunoA[i];
		 * }
		 */

		// System.out.println(totalAlunoA / notasAlunoA.length);

		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

		for (double notasB : notasAlunoB) {
			System.out.println("\nNotas da turma B " + notasB);
		}
		/*
		 * for (int i = 0; i < notasAlunoB.length; i++) { totalAlunoB += notasAlunoB[i];
		 * }
		 * 
		 * System.out.println(totalAlunoB / notasAlunoB.length);
		 */

	}

}
