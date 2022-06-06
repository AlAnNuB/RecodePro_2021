package br.com.seguranamaodedeus.api.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compras")
public class Compras {

	@EmbeddedId
	private ComprasPK id = new ComprasPK();
	
	private Double valorTotal;
	
	public Compras() {
		
	}
	
	public void setViagens(Viagens viagens) {
		id.setViagens(viagens);
	}
	
	public void setClientes(Clientes clientes) {
		id.setClientes(clientes);
	}

	public ComprasPK getId() {
		return id;
	}

	public void setId(ComprasPK id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
