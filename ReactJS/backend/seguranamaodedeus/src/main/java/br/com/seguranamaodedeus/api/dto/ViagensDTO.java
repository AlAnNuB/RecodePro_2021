package br.com.seguranamaodedeus.api.dto;

import java.sql.Date;

import br.com.seguranamaodedeus.api.entities.Viagens;

public class ViagensDTO {

	private Long IdViagens;
	private String destino;
	private Double preco;
	private String img;
	private Date ida;
	
	public ViagensDTO() {
		
	}

	public ViagensDTO(Long idViagens, String destino, Double preco, String img, Date ida) {
		super();
		IdViagens = idViagens;
		this.destino = destino;
		this.preco = preco;
		this.img = img;
		this.ida = ida;
	}

	public ViagensDTO(Viagens viagens) {
		IdViagens = viagens.getIdViagens();
		destino = viagens.getDestino();
		preco = viagens.getPreco();
		img = viagens.getImg();
		ida = viagens.getIda();
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
