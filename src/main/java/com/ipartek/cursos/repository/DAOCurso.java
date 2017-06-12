package com.ipartek.cursos.repository;

import java.util.List;

import javax.sql.DataSource;

import com.ipartek.cursos.domain.Curso;

/**
 * Interfaz para manejar todo lo relativo a los usuarios
 * 
 * @author Curso
 *
 */
public interface DAOCurso {

	/**
	 * 
	 * @param ds
	 *            data source
	 */
	void setDatasource(DataSource ds);

	/**
	 * 
	 * @return Listado de todos los cursos
	 */
	List<Curso> getAll();

	/**
	 * 
	 * @return Listado con los 10 �ltimos cursos
	 */
	List<Curso> getDiez();

	/**
	 * Seleccionar curso
	 * 
	 * @param id
	 *            ID del curso
	 * @return Curso seleccionado por ID
	 */
	Curso getById(long id);

	/**
	 * A�adir curso
	 * 
	 * @param c
	 *            curso a insertar
	 * @return curso insertado
	 */
	boolean insert(Curso c);

	/**
	 * 
	 * Editar curso.
	 * 
	 * @param c
	 *            curso a insertar
	 * @return curso editado
	 */
	boolean update(Curso c);

	/**
	 * Eliminar curso
	 * 
	 * @param id
	 *            id del curso a eliminar
	 * @return Lista con el curso eliminado.
	 */
	boolean delete(long id);

}
