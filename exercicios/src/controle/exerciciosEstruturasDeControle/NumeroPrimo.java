package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número e te direi se é primo: ");
		int numeroPrimo;
		numeroPrimo = entrada.nextInt();
		
		if (numeroPrimo % 2 == 1) {
			System.out.println("É um número primo");
		} else {
			System.out.println("Não é um número primo");
		}
		
		
		
		//Pseudocode
		//The sieve of Eratosthenes can be expressed in pseudocode, as follows:
		/*
		algorithm Sieve of Eratosthenes is
	    input: an integer n > 1.
	    output: all prime numbers from 2 through n.

	    let A be an array of Boolean values, indexed by integers 2 to n,
	    initially all set to true.
	    
	    for i = 2, 3, 4, ..., not exceeding √n do
	        if A[i] is true
	            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
	                A[j] := false

	    return all i such that A[i] is true.
		*/
		
		
		
		
		
		
		
		
		entrada.close();

	}

}
