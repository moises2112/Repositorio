package br.senai.sp.informatica.easysystem.model;

public enum TipoUsuario {
	CLIENTE("Cliente"), SUPERVISOR("Supervisor"), TECNICO("Técnico");
	
	private String descricao;
	
	private TipoUsuario(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
