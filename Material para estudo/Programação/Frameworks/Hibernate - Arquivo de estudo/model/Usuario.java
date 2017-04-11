package br.senai.sp.informatica.easysystem.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

public abstract class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;	
	
	@Column(nullable=false)
	@Length(min=5, message = "Este campo deve possuir no mínimo 5 caracteres!")
	protected String nome;
	
	@Column(nullable=false)
	@Length(min=10, message = "Este campo deve possuir no mínimo 10 caracteres!")
	protected String telefone;
	
	@Column(nullable=false)
	@Length(min=8, message = "Este campo deve possuir no mínimo 8 caracteres!")
	protected String email;
	
	@Column(nullable=false)
	@Length(min=5, message = "Este campo deve possuir no mínimo 5 caracteres!")
	protected String login;
	
	@Column(nullable=false)
	@Length(min=8, message = "Este campo deve possuir no mínimo 8 caracteres!")
	protected String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
