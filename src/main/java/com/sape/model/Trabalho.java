package com.sape.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Trabalho extends AbstractEntity {

	private String titulo;
	
	private String resumo;
	
	private String palavrasChave;
	
	@ManyToOne
	private Evento evento;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(String palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
}
