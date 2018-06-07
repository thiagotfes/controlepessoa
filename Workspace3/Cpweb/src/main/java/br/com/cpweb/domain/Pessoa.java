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
public class Pessoa extends GenericDomain {
	@Column(length = 6, nullable = false, unique = true)
	private String cdpessoa;
	@Column(length = 19, nullable = false, unique = true)
	private String cpfcnpj;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 3)
	private Short idade;
	@Column(length = 200, nullable = false)
	private String endereco;
	@Column(length = 10, nullable = false)
	private String nr;
	@Column(length = 200)
	private String complemento;
	@Column(length = 15)
	private String cep;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 300)
	private String observacao;
	@Column(length = 15)
	private String telefone;
	@Column(length = 30)
	private String contato;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtcadastro;
	@Column(nullable = false)
	private Boolean ativo;

	// Chaves estrangeiras
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Estado uf;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Bairro bairro;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Pais pais;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Classificacao classificacao;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Genero genero;

	@ManyToOne
	@JoinColumn(nullable = false)
	private EstadoCivil estadocivil;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TipoPessoa tipopessoa;

	public String getCdpessoa() {
		return cdpessoa;
	}

	public void setCdpessoa(String cdpessoa) {
		this.cdpessoa = cdpessoa;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getIdade() {
		return idade;
	}

	public void setIdade(Short idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Date getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getUf() {
		return uf;
	}

	public void setUf(Estado uf) {
		this.uf = uf;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public TipoPessoa getTipopessoa() {
		return tipopessoa;
	}

	public void setTipopessoa(TipoPessoa tipopessoa) {
		this.tipopessoa = tipopessoa;
	}

}
