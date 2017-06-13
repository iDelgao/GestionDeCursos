package com.ipartek.cursos.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ipartek.cursos.domain.Curso;
import com.ipartek.cursos.repository.mapper.CursoMapper;

/**
 * Implementación del DAO con SQLs de modificación y acceso a la BBDDs.
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

	private static final String SQL_GET_ALL = "SELECT `id`, `nomCurso`, `codCurso` FROM `cursos`";
	private static final String SQL_GET_DIEZ = "SELECT `id`, `nomCurso`, `codCurso` FROM `cursos` ORDER BY `id` DESC LIMIT 10;";
	private static final String SQL_GET_ALL_FILTER = "SELECT `id`, `nomCurso`, `codCurso` FROM `cursos` WHERE `nomCurso` LIKE '%' ? '%' ORDER BY `id` DESC LIMIT 500;";
	private static final String SQL_GET_BY_ID = "SELECT `id`, `nomCurso`, `codCurso` FROM `cursos` WHERE `id` = ?;";
	private static final String SQL_INSERT = "INSERT INTO `cursos` (`nomCurso`, `codCurso`) VALUES (?, ?);";
	private static final String SQL_UPDATE = "UPDATE `cursos` SET `nomCurso`= ?,`codCurso`= ? WHERE `id`= ? ;";
	private static final String SQL_DELETE = "DELETE FROM `cursos` WHERE `id` = ?;";

	@Override()
	public List<Curso> getAll(String filter) {

		ArrayList<Curso> lista = new ArrayList<Curso>();

		try {

			if (filter == null) {
				lista = (ArrayList<Curso>) this.jdbcTemplate.query(SQL_GET_ALL, new CursoMapper());
			} else {
				lista = (ArrayList<Curso>) this.jdbcTemplate.query(SQL_GET_ALL_FILTER, new Object[] { filter },
						new CursoMapper());

			}

		} catch (EmptyResultDataAccessException e) {
			this.LOG.error("No existen cursos todavia", e);
		} catch (Exception e) {
			this.LOG.error(e.getMessage(), e);
		}
		return lista;
	}

	@Override()
	public List<Curso> getDiez(String filter) {
		ArrayList<Curso> lista = new ArrayList<Curso>();

		try {
			lista = (ArrayList<Curso>) this.jdbcTemplate.query(SQL_GET_DIEZ, new CursoMapper());

		} catch (EmptyResultDataAccessException e) {
			this.LOG.warn("No existen cursos todavia");

		} catch (Exception e) {
			this.LOG.error(e.getMessage());
		}

		return lista;
	}

	@Override()
	public Curso getById(long id) {

		Curso c = new Curso();

		try {
			c = this.jdbcTemplate.queryForObject(SQL_GET_BY_ID, new Object[] { id }, new CursoMapper());
		} catch (EmptyResultDataAccessException e) {
			this.LOG.warn("No existen cursos todavia.");
		} catch (Exception e) {
			this.LOG.error(e.getMessage());
		}
		return c;
	}

	@Override()
	public boolean insert(final Curso c) {

		LOG.trace("Insert " + c);
		boolean resul = false;

		try {
			int affectedeRows = -1;
			KeyHolder keyHolder = new GeneratedKeyHolder();

			affectedeRows = this.jdbcTemplate.update(new PreparedStatementCreator() {

				@Override()
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					PreparedStatement ps = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
					ps.setString(1, c.getNomCurso());
					ps.setString(2, c.getCodCurso());
					return ps;
				}
			}, keyHolder);

			if (affectedeRows == 1) {
				c.setId(keyHolder.getKey().intValue());
				resul = true;
			}
		} catch (Exception e) {
			this.LOG.error(e.getMessage());
		}
		return resul;
	}

	@Override()
	public boolean update(Curso c) {

		LOG.trace("update " + c);
		boolean resul = false;
		int affectedRows = -1;

		try {
			Object[] argumentos = { c.getNomCurso(), c.getCodCurso(), c.getId() };
			affectedRows = this.jdbcTemplate.update(SQL_UPDATE, argumentos);

			if (affectedRows == 1) {
				resul = true;
			}
		} catch (Exception e) {
			this.LOG.error(e.getMessage());
		}
		return resul;
	}

	@Override()
	public boolean delete(long id) {

		LOG.trace("eliminar " + id);
		boolean resul = false;
		int affectedRows = -1;

		try {
			affectedRows = this.jdbcTemplate.update(SQL_DELETE, id);
			if (affectedRows == 1) {
				resul = true;
			}
		} catch (DataIntegrityViolationException e) {
			this.LOG.warn(e.getMessage());
		} catch (Exception e) {
			this.LOG.error(e.getMessage());
		}
		return resul;
	}

}
