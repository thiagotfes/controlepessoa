package br.com.cpweb.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Usuario extends GenericDomain {
	@Column(length = 6, nullable = false, unique = true)
	private String cdusuario;
	@Column(length = 30, nullable = false, unique = true)
	private String login;
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 32, nullable = false)
	private String senha;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtcadastro;
	@Column
	private Date dtultimoacesso;
	@Column(nullable = false)
	private Boolean ativo;
	

	@ManyToOne
	@JoinColumn(nullable = false)
	private TipoUsuario tipousuario;

	public String getCdusuario() {
		return cdusuario;
	}

	public void setCdusuario(String cdusuario) {
		this.cdusuario = cdusuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public Date getDtultimoacesso() {
		return dtultimoacesso;
	}

	public void setDtultimoacesso(Date dtultimoacesso) {
		this.dtultimoacesso = dtultimoacesso;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public TipoUsuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}

}