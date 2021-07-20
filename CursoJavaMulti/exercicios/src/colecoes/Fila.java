package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		// Diferença é o comportamento quando a fila está cheia!
		// Offer e Add -> adicionam elementos na fila
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// para cada "pessoa" na fila, imprima pessoa
		for (String pessoa : fila) {
			System.out.println(pessoa);
			
		}

		// Diferença é o comportamento que ocorre quando a fila está vazia!
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());

		// Diferença é o comportamento que ocorre quando a fila está vazia!
		// Poll e Remove -> obter o próximo elemento da fila e remove!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); // retorna null

		// fila.clear();
		// System.out.println(fila.size());
		// System.out.println(fila.isEmpty());
		// System.out.println(fila.contains());

	}
}
