package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.CategoriaLivro;

public class RepositorioDeCategoriasLivroEmMemoria implements RepositorioDeCategoriasLivro {
	private static List<CategoriaLivro> categoriasLivro;

	@Override
	public boolean cadastrar(CategoriaLivro categoriaLivro) {
		categoriasLivro.add(categoriaLivro);
		return false;
	}

	@Override
	public CategoriaLivro buscar(String nome) {
		for (CategoriaLivro categoriaLivro : categoriasLivro) {
			if (nome.equals(categoriaLivro.getCodigo())) {
				return categoriaLivro;
			}
		}
		return null;
	}

	@Override
	public List<CategoriaLivro> listar() {
		return categoriasLivro;
	}

}
