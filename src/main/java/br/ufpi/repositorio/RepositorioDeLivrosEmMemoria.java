package br.ufpi.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.modelo.Livro;

public class RepositorioDeLivrosEmMemoria implements RepositorioDeLivros{
	
	private static List<Livro> livros;
	
	public RepositorioDeLivrosEmMemoria() {
		if(livros == null) {
			livros = new ArrayList<>();
		}
	}

	@Override
	public boolean cadastrar(Livro livro) {
		livros.add(livro);
		return true;
	}

	@Override
	public Livro buscar(String nome) {
		for(Livro livro: livros) {
			if(nome.equals(livro.getNome())) {
				return livro;
			}
		}
		return null;
	}

	@Override
	public List<Livro> listar() {
		return livros;
	}

}
