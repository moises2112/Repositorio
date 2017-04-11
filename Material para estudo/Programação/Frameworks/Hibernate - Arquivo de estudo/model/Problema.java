package br.senai.sp.informatica.easysystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

@Entity

public class Problema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Length(min = 5, message = "Este campo deve poassuir no mínimo 5 caracteres!")
	@Column(nullable=false)
	private String nome;
	
	@Length(min = 5, message = "Este campo deve poassuir no mínimo 5 caracteres!")
	@Column(nullable=false)
	private String descricao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Problema){
			Problema p = (Problema)obj;
			return (this.id.equals(p.id) && this.nome.equals(p.nome) && this.descricao.equals(p.descricao))?true:false;
		}else{
			return false;
		}
	}
	
}
