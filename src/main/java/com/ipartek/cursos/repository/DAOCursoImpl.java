package com.ipartek.cursos.repository;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ipartek.cursos.domain.Curso;
import com.ipartek.cursos.repository.mapper.CursoMapper;

/**
 * DAO para conectarse a la BBDD
 * 
 * @author Iván Delgado García
 *
 */
@Repository(value = "daoCurso")
public class DAOCursoImpl implements DAOCurso {

	private final Log LOG = LogFactory.getLog(getClass());
	@Autowired()
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired()
	@Override()
	public void setDatasource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	private static final String SQL_GET_ALL = "SELECT * FROM cursos";
	private static final String SQL_INSERT = "INSERT INTO `cursos` (`nomcurso`, `codcurso`) VALUES (?,?);";
	private static final String SQL_UPDATE = "UPDATE `cursos` SET `nomcurso`= ? , `codcurso`= ?  WHERE `id`= ? ;";
	private static final String SQL_DELETE = "DELETE FROM `cursos` WHERE `id` = ?;";

	@Override
	public List<Curso> getAll() {
		ArrayList<Curso> lista = new ArrayList<Curso>();

		try {

			lista = (ArrayList<Curso>) this.jdbcTemplate.query(SQL_GET_ALL, new CursoMapper());

		} catch (EmptyResultDataAccessException e) {

			this.LOG.error("No existen cursos todavia", e);

		} catch (Exception e) {

			this.LOG.error(e.getMessage(), e);

		}
		return lista;
	}

}
