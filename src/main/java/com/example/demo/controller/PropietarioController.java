package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Propietario;
import com.example.demo.service.IPropietarioService;

@Controller
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private IPropietarioService iPropietarioService;

	// http://localhost:8080/concesionario/propietarios/reporte
	@GetMapping("/reporte")
	public String buscarTodos(Model model) {
		List<Propietario> lista = this.iPropietarioService.reporte();
		model.addAttribute("propietarios", lista);
		return "vistaReporte";
	}

	// http://localhost:8080/concesionario/propietarios/buscarPorID/1
	@GetMapping("/buscarPorID/{idPropietario}")
	public String buscarPorId(@PathVariable("idPropietario") Integer id, Model model) {

		Propietario pro = this.iPropietarioService.encontrarId(id);
		model.addAttribute("propietario", pro);
		return "vistaPropietario";
	}

	@PutMapping("/actualizar/{idPropietario}")
	public String actualizaPropietario(@PathVariable("idPropietario") Integer id, Propietario propietario) {

		this.iPropietarioService.modificar(propietario);

		return "redirect:/propietarios/reporte";
	}

	// http://localhost:8080/consesionario/propietarios/borrar/1,2 o 3
	@DeleteMapping("/borrar/{idPropietario}")
	public String eliminarPorId(@PathVariable("idPropietario") Integer id) {
		this.iPropietarioService.borrar(id);
		return "redirect:/propietarios/reporte";
	}

	@PostMapping("/guardar")
	public String insertarPropietario(Propietario propietario) {

		this.iPropietarioService.agregar(propietario);
		return "redirect:/propietarios/reporte";
	}

	// METODO PAGINA DE REDICRECCIONAMIENTEO

	@GetMapping("/nuevo")
	public String paginaNuevoPropietario(Propietario propietario) {

		return "vistaNuevoPropietario";
	}

}
