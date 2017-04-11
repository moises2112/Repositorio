package br.senai.sp.informatica.easysystem.model;

public enum TipoAcao {
	ENCAMINHADO("encaminhado"), SOLUCIONADO("solucionado"), FINALIZADO("finalizado"), REABERTO("reaberto");
	
	private String descricao;
	
	TipoAcao(String descricao){
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
