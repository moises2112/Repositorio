package br.senai.sp.informatica.easysystem.model;

public enum TipoGravidadeSituacao {
	ALTA("Alta"), BAIXA("Baixa"), MEDIA("Média");
	
	private TipoGravidadeSituacao(String descricao){
		this.descricao = descricao;
	}
	
	private String descricao;
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
