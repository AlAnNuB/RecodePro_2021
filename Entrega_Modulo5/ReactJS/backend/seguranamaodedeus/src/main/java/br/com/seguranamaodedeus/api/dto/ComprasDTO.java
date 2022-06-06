package br.com.seguranamaodedeus.api.dto;

public class ComprasDTO {

	private Long viagensId;
	private String nome;
	private String cpf;
	private Double valorTotal;
	
	public ComprasDTO() {
		
	}

	public Long getViagensId() {
		return viagensId;
	}

	public void setViagensId(Long viagensId) {
		this.viagensId = viagensId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
}
