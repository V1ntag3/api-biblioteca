package br.ufpi.repositorio;

import java.util.List;

import br.ufpi.modelo.Biblioteca;

public interface RepositorioDeBibliotecas {
	public boolean cadastrar(Biblioteca biblioteca);

	public Biblioteca buscar(String nome);

	public List<Biblioteca> listar();
}
