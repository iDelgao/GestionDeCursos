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

	void setDatasource(DataSource ds);

	List<Curso> getAll();

	/*
	 * Curso getById(int id);
	 * 
	 * boolean insert(Curso c);
	 * 
	 * boolean update(Curso u);
	 * 
	 * boolean delete(int id) throws DataIntegrityViolationException;
	 */

}
