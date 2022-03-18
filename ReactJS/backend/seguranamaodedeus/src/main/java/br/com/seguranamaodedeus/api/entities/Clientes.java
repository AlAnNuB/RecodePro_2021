package br.com.seguranamaodedeus.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nome;
	private String cpf;
	
	public Clientes() {
		
	}

	public Clientes(Long idCliente, String nome, String cpf) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return idCliente;
	}

	public void setId(Long idCliente) {
		this.idCliente = idCliente;
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
	
	
}
