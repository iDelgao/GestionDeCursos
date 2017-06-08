package com.ipartek.cursos.service;

import java.util.List;

import com.ipartek.cursos.domain.Curso;

public interface ServiceCurso {

	List<Curso> listar();

	Curso buscarPorID(long id);

	boolean crear(Curso c);

	boolean modificar(Curso c);

	boolean eliminar(long id);

}
