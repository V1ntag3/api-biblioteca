package br.ufpi.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Emprestimo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Cliente cliente;
	private List<Livro> livrosEmprestimo;

	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao
				+ ", cliente=" + cliente + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Livro> getLivrosEmprestimo() {
		return livrosEmprestimo;
	}

	public void setLivrosEmprestimo(List<Livro> livrosEmprestimo) {
		this.livrosEmprestimo = livrosEmprestimo;
	}

}
