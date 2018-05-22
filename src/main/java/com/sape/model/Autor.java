package com.sape.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Autor extends AbstractEntity{

	private String nome;
	
	private String matricula;
	
	private String Curso;
	
	@OneToOne
	private Trabalho trabalho;

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
	
}
