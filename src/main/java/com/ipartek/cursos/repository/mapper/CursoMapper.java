package com.ipartek.cursos.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ipartek.cursos.domain.Curso;

public class CursoMapper implements RowMapper<Curso> {

	@Override
	public Curso mapRow(ResultSet rs, int rowNum) throws SQLException {

		Curso c = new Curso();

		c.setId(rs.getInt("id"));
		c.setNomCurso(rs.getString("nomCurso"));
		c.setCodCurso(rs.getString("codCurso"));

		return c;

	}

}
