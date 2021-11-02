package br.ufpi.modelo;

import java.io.Serializable;
import java.util.List;

import br.ufpi.enuns.SituacaoClienteEnum;

public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codigo;
	private String nome;
	private String email;
	private List<Emprestimo> emprestimos;
	private SituacaoClienteEnum situacao;

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", emprestimos="
				+ emprestimos + "]";
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SituacaoClienteEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoClienteEnum situacao) {
		this.situacao = situacao;
	}

}
