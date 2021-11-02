package br.ufpi.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.modelo.Biblioteca;

public class RepositorioDeBibliotecasEmMemoria implements RepositorioDeBibliotecas {

	private static List<Biblioteca> bibliotecas;

	public RepositorioDeBibliotecasEmMemoria() {
		if (bibliotecas == null) {
			bibliotecas = new ArrayList<>();
		}

	}

	public boolean cadastrar(Biblioteca biblioteca) {
		bibliotecas.add(biblioteca);

		return false;
	}

	public Biblioteca buscar(String nome) {
		for (Biblioteca biblioteca : bibliotecas) {
			if (nome.equals(biblioteca.getNome())) {
				return biblioteca;
			}
		}
		return null;
	}

	public List<Biblioteca> listar() {
		return bibliotecas;
	}

}
