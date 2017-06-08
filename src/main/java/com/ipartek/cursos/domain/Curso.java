package com.ipartek.cursos.domain;

/**
 * Pojo Curso
 * 
 * @author Iván Delgado García
 *
 */

public class Curso {

	// ATRIBUTOS
	private int id;
	private String nomCurso;
	private String codCurso;

	/**
	 * Contructor con parámetros vacios
	 */
	public Curso() {
		super();
		this.id = -1;
		this.nomCurso = "";
		this.codCurso = "";
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param id
	 *            id del curso
	 * @param nomCurso
	 *            nombre del curso
	 * @param codCurso
	 *            código del curso
	 */
	public Curso(int id, String nomCurso, String codCurso) {
		super();
		this.id = id;
		this.codCurso = codCurso;
		this.nomCurso = nomCurso;
	}

	// GETTERS AND SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomCurso() {
		return nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nomCurso=" + nomCurso + ", codCurso=" + codCurso + "]";
	}

}
