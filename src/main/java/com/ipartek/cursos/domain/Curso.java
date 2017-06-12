package com.ipartek.cursos.domain;

/**
 * Pojo Curso
 * 
 * @author Iv�n Delgado Garc�a
 *
 */

public class Curso {

	// ATRIBUTOS
	private int id;
	private String nomCurso;
	private String codCurso;

	/**
	 * Contructor con par�metros vacios
	 */
	public Curso() {
		super();
		this.id = -1;
		this.nomCurso = "";
		this.codCurso = "";
	}

	/**
	 * Constructor con par�metros
	 * 
	 * @param id
	 *            id del curso
	 * @param nomCurso
	 *            nombre del curso
	 * @param codCurso
	 *            c�digo del curso
	 */
	public Curso(int id, String nomCurso, String codCurso) {
		super();
		this.id = id;
		this.codCurso = codCurso;
		this.nomCurso = nomCurso;
	}

	// GETTERS AND SETTERS

	/**
	 * 
	 * @return id del curso.
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            curso
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return nombre del curso.
	 */
	public String getNomCurso() {
		return nomCurso;
	}

	/**
	 * 
	 * @param nomCurso
	 *            set nombre.
	 */
	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	/**
	 * 
	 * @return c�digo del curso.
	 */
	public String getCodCurso() {
		return codCurso;
	}

	/**
	 * 
	 * @param codCurso
	 *            set c�digo.
	 */
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override()
	public String toString() {
		return "Curso [id=" + id + ", nomCurso=" + nomCurso + ", codCurso=" + codCurso + "]";
	}

}
