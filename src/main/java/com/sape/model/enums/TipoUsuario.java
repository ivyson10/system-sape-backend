package com.sape.model.enums;

public enum TipoUsuario {
	
	ADMIN,
	AVALIADOR;
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
