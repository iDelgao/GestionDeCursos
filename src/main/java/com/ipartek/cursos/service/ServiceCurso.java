package com.ipartek.cursos.service;

import java.util.List;

import com.ipartek.cursos.domain.Curso;

/**
 * Intefaz del servicio.
 * 
 * @author curso
 *
 */
public interface ServiceCurso {

	/**
	 * 
	 * @return lista de cursos
	 */
	List<Curso> listar(String filter);

	/**
	 * 
	 * @return listar 10 últimos cursos
	 */
	List<Curso> listarDiez(String filter);

	/**
	 * Busca curso por ID
	 * 
	 * @param id
	 *            Id del curso
	 * @return curso por ID.
	 */
	Curso buscarPorID(long id);

	/**
	 * Crea un curso nuevo
	 * 
	 * @param c
	 *            curso
	 * @return curso creado.
	 */
	boolean crear(Curso c);

	/**
	 * Modifica curso.
	 * 
	 * @param c
	 *            curso
	 * @return curso modificado
	 */
	boolean modificar(Curso c);

	/**
	 * Elimina curso.
	 * 
	 * @param id
	 *            ID del curso a eliminar.
	 * @return vista con listado de cursos.
	 */
	boolean eliminar(long id);

}
