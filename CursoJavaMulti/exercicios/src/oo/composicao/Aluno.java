package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	public final String nome;
	final List<Curso> cursos = new ArrayList<>();
	public int nota;

	public Aluno(String nome, int i) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);

	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}

		}

		return null;

	}

	public String toString() {
		return nome;
	}

}
