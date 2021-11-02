package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.Cliente;

public interface RepositorioDeClientes {
	public boolean cadastrar(Cliente cliente);

	public Cliente buscar(String nome);

	public List<Cliente> listar();
}
