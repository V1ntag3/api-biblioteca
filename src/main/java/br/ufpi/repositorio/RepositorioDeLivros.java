package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.Livro;

public interface RepositorioDeLivros {
	
	public boolean cadastrar(Livro livro);
	public Livro buscar(String nome);
	public List<Livro> listar();

}
