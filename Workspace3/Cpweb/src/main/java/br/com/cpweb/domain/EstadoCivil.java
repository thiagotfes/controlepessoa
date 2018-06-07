package br.com.cpweb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class EstadoCivil extends GenericDomain {
	@Column(length = 6, nullable = false, unique=true)
	private String cdestadocivil;
	@Column(length = 15, nullable = false, unique=true)
	private String nome;

	public String getCdestadocivil() {
		return cdestadocivil;
	}

	public void setCdestadocivil(String cdestadocivil) {
		this.cdestadocivil = cdestadocivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
