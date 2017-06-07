package com.ipartek.cursos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contolador para el administrador.
 * 
 * @author Iván Delgado
 *
 */
@Controller()
public class AdminController {

	private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

	/**
	 * Listar cursos
	 * 
	 * @param model
	 *            modelo
	 * @return lista de usuarios
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String listar(Model model) {
		LOG.info("");

		return "admin/index";
	}

}
