package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.Cliente;

public class RepositorioDeClientesEmMemoria implements RepositorioDeClientes {
	private static List<Cliente> clientes;

	@Override
	public boolean cadastrar(Cliente cliente) {
		clientes.add(cliente);
		return false;
	}

	@Override
	public Cliente buscar(String nome) {
		for (Cliente cliente : clientes) {
			if (nome.equals(cliente.getNome())) {
				return cliente;
			}
		}
		return null;
	}

	@Override
	public List<Cliente> listar() {
		return clientes;
	}

}
