package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.CategoriaLivro;

public interface RepositorioDeCategoriasLivro {
	public boolean cadastrar(CategoriaLivro categoriaLivro);

	public CategoriaLivro buscar(String nome);

	public List<CategoriaLivro> listar();
}
