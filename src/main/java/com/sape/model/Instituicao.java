package com.sape.model;

import javax.persistence.Entity;

@Entity
public class Instituicao extends AbstractEntity {

	private String nome;
	
	private String sigla;
	
	private String Campus;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCampus() {
		return Campus;
	}

	public void setCampus(String campus) {
		Campus = campus;
	}
	
}
