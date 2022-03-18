package br.com.seguranamaodedeus.api.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Viagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdViagens;
	private String destino;
	private Double preco;
	private String img;
	private Date ida;
	
	public Viagens() {
		
	}
	
	public Viagens(Long idViagens, String destino, Double preco, String img, Date ida) {
		super();
		IdViagens = idViagens;
		this.destino = destino;
		this.preco = preco;
		this.img = img;
		this.ida = ida;
	}

	public Long getIdViagens() {
		return IdViagens;
	}

	public void setIdViagens(Long idViagens) {
		IdViagens = idViagens;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getIda() {
		return ida;
	}

	public void setIda(Date ida) {
		this.ida = ida;
	}
}
