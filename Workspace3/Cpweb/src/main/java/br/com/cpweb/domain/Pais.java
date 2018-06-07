package br.com.cpweb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pais extends GenericDomain {
	@Column(length=6, nullable=false, unique=true)
	private String cdpais;
	@Column(length=50, nullable=false, unique=true)
	private String nome;

	public String getCdpais() {
		return cdpais;
	}

	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}