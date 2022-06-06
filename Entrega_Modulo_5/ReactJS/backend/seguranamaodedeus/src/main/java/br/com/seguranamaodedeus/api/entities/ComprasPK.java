package br.com.seguranamaodedeus.api.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ComprasPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "viagens_id")
	private Viagens viagens;
	
	@ManyToOne
	@JoinColumn(name = "clientes_id")
	private Clientes clientes;
	
	public ComprasPK() {
		
	}

	public ComprasPK(Viagens viagens, Clientes clientes) {
		super();
		this.viagens = viagens;
		this.clientes = clientes;
	}

	public Viagens getViagens() {
		return viagens;
	}

	public void setViagens(Viagens viagens) {
		this.viagens = viagens;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
}
