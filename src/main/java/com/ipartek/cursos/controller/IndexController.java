package com.ipartek.cursos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.cursos.service.ServiceCurso;

/**
 * Controlador de la p�gina inicial.
 * 
 * @author Iv�n Delgado
 *
 */
@Controller()
public class IndexController {

	@Autowired()
	private ServiceCurso serviceCurso;

	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

	/**
	 * 
	 * @param model
	 *            Devuelve la lista de cursos
	 * @return a la p�gina de inicio.
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		LOG.info("P�gina de inicio");

		model.addAttribute("cursos", serviceCurso.listarDiez(null));

		return "index";
	}

	@RequestMapping(value = "/accesibilidad", method = RequestMethod.GET)
	public String accesibilidad(Model model) {

		LOG.info("Entrando: P�gina accesibilidad.");

		return "accesibilidad/index";
	}

}
