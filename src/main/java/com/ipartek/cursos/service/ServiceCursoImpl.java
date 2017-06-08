package com.ipartek.cursos.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.cursos.domain.Curso;
import com.ipartek.cursos.repository.DAOCurso;

/**
 * Implementacion del servicio Curso
 * 
 * @author Iván Delgado García
 *
 */
@Service(value = "serviceCurso")
public class ServiceCursoImpl implements ServiceCurso {

	private final Log LOG = LogFactory.getLog(getClass());

	@Autowired()
	private DAOCurso daoCurso;

	@Override()
	public List<Curso> listar() {
		this.LOG.trace("listar cursos");
		return this.daoCurso.getAll();
	}

}