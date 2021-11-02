package br.ufpi.modelo;

import java.io.Serializable;
import java.util.List;

public class CategoriaLivro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codigo;
	private String descricao;
	private List<Livro> livrosCategoria;

	@Override
	public String toString() {
		return "CategoriaLivro [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", livroscat="
				+ livrosCategoria + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Livro> getLivrosCategoria() {
		return livrosCategoria;
	}

	public void setLivrosCategoria(List<Livro> livrosCategoria) {
		this.livrosCategoria = livrosCategoria;
	}

}
