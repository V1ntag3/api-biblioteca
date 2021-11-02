package br.ufpi.modelo;

import java.io.Serializable;
import java.util.List;

public class Livro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String titulo1;
	private String titulo2;
	private String autor;
	private String anoEdicao;
	private String edicao;
	private String numTombo;
	private CategoriaLivro categoria;
	private Biblioteca biblioteca;
	private List<Emprestimo> emprestimosLivros;

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo1=" + titulo1 + ", titulo2=" + titulo2 + ", autor=" + autor + ", anoEdicao="
				+ anoEdicao + ", edicao=" + edicao + ", numTombo=" + numTombo + ", categoria=" + categoria
				+ ", biblioteca=" + biblioteca + ", emprestimosLivros=" + emprestimosLivros + "]";
	}

	public CategoriaLivro getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLivro categoria) {
		this.categoria = categoria;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public List<Emprestimo> getEmprestimosLivros() {
		return emprestimosLivros;
	}

	public void setEmprestimosLivros(List<Emprestimo> emprestimosLivros) {
		this.emprestimosLivros = emprestimosLivros;
	}

	public Livro() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo1() {
		return titulo1;
	}

	public void setTitulo1(String titulo1) {
		this.titulo1 = titulo1;
	}

	public String getTitulo2() {
		return titulo2;
	}

	public void setTitulo2(String titulo2) {
		this.titulo2 = titulo2;
	}

	public String getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(String anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getNumTombo() {
		return numTombo;
	}

	public void setNumTombo(String numTombo) {
		this.numTombo = numTombo;
	}

}
