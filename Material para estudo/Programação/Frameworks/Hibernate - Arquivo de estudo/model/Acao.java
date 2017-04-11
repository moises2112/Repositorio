package br.senai.sp.informatica.easysystem.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Acao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private long chamado_id;
	
	@Column(columnDefinition="tinyint(1)", nullable=false)
	private TipoAcao tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Calendar dtAcao;
	
	@Column(nullable = true)
	private String parecerTecnico;
	
	@Column(nullable = true)
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getChamado_id() {
		return chamado_id;
	}

	public void setChamado_id(long chamado_id) {
		this.chamado_id = chamado_id;
	}

	public TipoAcao getTipo() {
		return tipo;
	}

	public void setTipo(TipoAcao tipo) {
		this.tipo = tipo;
	}

	public Calendar getDtAcao() {
		return dtAcao;
	}

	public void setDtAcao(Calendar dtAcao) {
		this.dtAcao = dtAcao;
	}

	public String getParecerTecnico() {
		return parecerTecnico;
	}

	public void setParecerTecnico(String parecerTecnico) {
		this.parecerTecnico = parecerTecnico;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
