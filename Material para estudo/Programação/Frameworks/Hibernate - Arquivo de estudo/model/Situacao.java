package br.senai.sp.informatica.easysystem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames={"equipamento_id", "problema_id"}))
public class Situacao implements Serializable{	
	//Pode ser que esta classe tenha que extender a seguinte: extends DefaultNamingStrategy, para que seja possível criar a tabela de relacionamento com Hibernate
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Equipamento equipamento;
	
	@ManyToOne
	private Problema problema;
	
	@Column(columnDefinition="tinyint(1)")
	private TipoGravidadeSituacao gravidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	public Problema getProblema() {
		return problema;
	}
	public void setProblema(Problema problema) {
		this.problema = problema;
	}
	public TipoGravidadeSituacao getGravidade() {
		return gravidade;
	}
	public void setGravidade(TipoGravidadeSituacao gravidade) {
		this.gravidade = gravidade;
	}
}
