package br.ufpi.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.modelo.Livro;

public class RepositorioDeLivrosEmMemoria implements RepositorioDeLivros {
	private static List<Livro> livros;

	public RepositorioDeLivrosEmMemoria() {
		if (livros == null) {
			livros = new ArrayList<>();
		}

	}

	public boolean cadastrar(Livro livro) {
		livros.add(livro);

		return false;
	}

	public Livro buscar(String nome) {
		for (Livro livro : livros) {
			if (nome.equals(livro.getTitulo1())) {
				return livro;
			}
		}
		return null;
	}

	public List<Livro> listar() {
		return livros;
	}
}
