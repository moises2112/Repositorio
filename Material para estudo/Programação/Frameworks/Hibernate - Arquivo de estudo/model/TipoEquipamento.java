package br.senai.sp.informatica.easysystem.model;

public enum TipoEquipamento {
	HARDWARE("Hardware"), SOFTWARE("Software"), PERIFERICO("Perif�rico");
	
	private String descricao;
	
	private TipoEquipamento(String descricao){
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
