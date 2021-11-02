package br.ufpi.modelo;

import java.io.Serializable;
import java.util.List;

public class Biblioteca implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cidade;
	private String cep;
	private String email;
	private List<Livro> livrosBiblioteca;

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", cep=" + cep + ", email=" + email
				+ ", livrosBli=" + livrosBiblioteca + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Livro> getLivrosBiblioteca() {
		return livrosBiblioteca;
	}

	public void setLivrosBiblioteca(List<Livro> livrosBiblioteca) {
		this.livrosBiblioteca = livrosBiblioteca;
	}

}
