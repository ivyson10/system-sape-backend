package com.sape.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Evento extends AbstractEntity {

	private String titulo;
	
	private String tema;
	
	private LocalDate dataRealizacao;
	
	private Integer attributed;
	
	@ManyToOne
	private Instituicao instituicao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalDate getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(LocalDate dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public Integer getAttributed() {
		return attributed;
	}

	public void setAttributed(Integer attributed) {
		this.attributed = attributed;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	
}
