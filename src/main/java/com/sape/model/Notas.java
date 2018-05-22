package com.sape.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Notas extends AbstractEntity {

	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Trabalho trabalho;
	
	private Double nota1;
	
	private Double nota2;
	
	private Double nota3;
	
	private Double nota4;
	
	private Double nota5;
	
	private Double nota6;
	
	private Double nota7;
	
	private Double media;

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getNota4() {
		return nota4;
	}

	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}

	public Double getNota5() {
		return nota5;
	}

	public void setNota5(Double nota5) {
		this.nota5 = nota5;
	}

	public Double getNota6() {
		return nota6;
	}

	public void setNota6(Double nota6) {
		this.nota6 = nota6;
	}

	public Double getNota7() {
		return nota7;
	}

	public void setNota7(Double nota7) {
		this.nota7 = nota7;
	}
	
}
