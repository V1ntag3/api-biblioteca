package br.ufpi.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.modelo.Emprestimo;

public class RepositorioDeEmprestimosEmMemoria implements RepositorioDeEmprestimos {
	private static List<Emprestimo> emprestimos;

	public RepositorioDeEmprestimosEmMemoria() {
		if (emprestimos == null) {
			emprestimos = new ArrayList<>();
		}

	}

	public boolean cadastrar(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);

		return false;
	}

	public Emprestimo buscar(String nome) {
		for (Emprestimo emprestimo : emprestimos) {
			if (nome.equals(emprestimo.getCliente().getNome())) {
				return emprestimo;
			}
		}
		return null;
	}

	public List<Emprestimo> listar() {
		return emprestimos;
	}
}
