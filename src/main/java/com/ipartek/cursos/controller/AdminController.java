package com.ipartek.cursos.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.cursos.domain.Curso;
import com.ipartek.cursos.service.ServiceCurso;
import com.opencsv.CSVReader;

/**
 * Contolador para el administrador.
 * 
 * @author Ivan Delgado
 *
 */
@Controller()
public class AdminController {

	private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

	@Autowired()
	private ServiceCurso serviceCurso;

	/**
	 * Listar cursos para poder gestionarlos
	 * 
	 * @param model
	 *            modelo
	 * @return lista de cursos
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String listar(Model model) {

		LOG.info("Entrando: Página administrador.");

		model.addAttribute("cursos", serviceCurso.listar(null));
		return "admin/index";
	}

	/**
	 * 
	 * @param model
	 *            Devuelve un curso nuevo
	 * @return formulario.
	 */
	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
	public String irFormularioNuevo(Model model) {

		model.addAttribute("curso", new Curso());
		return "admin/form";
	}

	/**
	 * 
	 * @param id
	 *            ID del curso a editar.
	 * @param model
	 *            Curso editado.
	 * @return formulario.
	 */
	@RequestMapping(value = "/admin/edit/{id}", method = RequestMethod.GET)
	public String irFormularioEditar(@PathVariable() int id, Model model) {

		Curso curso = this.serviceCurso.buscarPorID(id);
		model.addAttribute("curso", curso);
		return "admin/form";
	}

	/**
	 * 
	 * @param curso
	 *            Nuevo curso.
	 * @param bindingResult
	 *            Validar datos.
	 * @param model
	 *            msg: mensaje para el usuario. Lista cursos con el nuevo curso
	 *            añadido.
	 * @return página de administración de cursos.
	 */
	@RequestMapping(value = "/admin/crear", method = RequestMethod.POST)
	public String crear(@Valid() Curso curso, BindingResult bindingResult, Model model) {

		LOG.info("Recibimos datos del formulario " + curso);
		String msg = null;

		// Validar datos del formulario
		if (!bindingResult.hasErrors()) {
			if (curso.getId() == -1) {
				this.serviceCurso.crear(curso);
				msg = "Curso creado satisfactoriamente.";
			} else {

				this.serviceCurso.modificar(curso);
				msg = "Curso modificado con éxito.";

			}

		} else {

			LOG.info("Formulario con datos no validos.");

		}

		model.addAttribute("msg", msg);
		model.addAttribute("cursos", serviceCurso.listar(null));

		return "admin/index";
	}

	/**
	 * Elimina curso
	 * 
	 * @param idCurso
	 *            identificador del curso
	 * @param model
	 *            <ol>
	 *            <li>msg: Mensaje para el usuario</li>
	 *            </ol>
	 * @return Si se elimina curso llamamos a la accion "listar".<br>
	 * 
	 * 
	 */
	@RequestMapping(value = "/admin/delete/{idCurso}", method = RequestMethod.GET)
	public String eliminar(@PathVariable() int idCurso, Model model) {

		LOG.info("Eliminar curso " + idCurso);
		String view = "redirect: ../";
		String msg = "Curso no eliminado";

		if (serviceCurso.eliminar(idCurso)) {
			msg = "Curso eleminado con éxito.";

		} else {

			view = "redirect: ../edit/" + idCurso;
		}
		model.addAttribute("msg", msg);
		return view;
	}

	@RequestMapping(value = "/admin/curso/subir", method = RequestMethod.GET)
	public String migrando(Model model) {

		String archivo = "C:/workspace/GestionDeCursos/deploy/cursos.csv";
		String msg = "";
		try {

			CSVReader reader = new CSVReader(new FileReader(archivo), ';');
			String[] nextLine;
			Curso curso = new Curso();
			int contador = 0;
			while ((nextLine = reader.readNext()) != null) {
				System.out.println(nextLine[1] + nextLine[8]);
				curso.setNomCurso(nextLine[1]);
				curso.setCodCurso(nextLine[8]);
				if (!"".equals(curso.getNomCurso()) && !"".equals(curso.getCodCurso())) {
					serviceCurso.crear(curso);
					contador++;
				}
			}
			reader.close();
			msg = "Fichero leido. Añadidos " + contador + " cursos nuevos";

		} catch (FileNotFoundException e) {
			msg = "Archivo no encontrado.";
			e.printStackTrace();
		} catch (Exception e) {
			msg = "Error volcando datos.";
			e.printStackTrace();
		}
		model.addAttribute("msg", msg);
		return "admin/subirFichero";
	}

}
