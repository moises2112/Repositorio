package br.senai.sp.informatica.easysystem.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Chamado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(nullable=true)
	private Tecnico tecnico;
	
	@ManyToOne
	@JoinColumn(nullable=true)
	private Supervisor supervisor;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Situacao situacao;
	
	@Column(nullable=false)
	private String nmrSerie;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(nullable=false)
	private Calendar dtAbertura;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(nullable=true)
	private Calendar dtFechamento;
	
	private String foto;
	
	private String parecerTecnico;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Supervisor getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Calendar getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(Calendar dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public Calendar getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(Calendar dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getParecerTecnico() {
		return parecerTecnico;
	}
	public void setParecerTecnico(String parecerTecnico) {
		this.parecerTecnico = parecerTecnico;
	}
	public String getNmrSerie() {
		return nmrSerie;
	}
	public void setNmrSerie(String nmrSerie) {
		this.nmrSerie = nmrSerie;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
