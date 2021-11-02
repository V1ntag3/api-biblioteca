package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.Emprestimo;

public interface RepositorioDeEmprestimos {
	public boolean cadastrar(Emprestimo emprestimo);

	public Emprestimo buscar(String nome);

	public List<Emprestimo> listar();
}
