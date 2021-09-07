package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		livros.push("1984");
		livros.push("A Revolução dos Bichos");
		livros.push("Budapeste");
		
		//System.out.println(livros.peek());
		//System.out.println(livros.element());
		
		// Stack - LAST IN / FIRST OUT / LIFO
		for (String livro : livros) {
			System.out.println(livro);
			
		}
		
		/*
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		*/
		
		
		System.out.println(livros.size());
		//livros.clear();
		System.out.println(livros.contains("O Hobbit"));
		//livros.isEmpty();
	}
}
