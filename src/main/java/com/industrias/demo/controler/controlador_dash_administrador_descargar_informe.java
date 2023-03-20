package com.industrias.demo.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.industrias.demo.interfaceService.IventasService;
import com.industrias.demo.modelo.ventas;

@Controller
@RequestMapping (path = "/descargar",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_dash_administrador_descargar_informe {
	
	@Autowired
	private IventasService service;

	//VISUALIZAR//
	@GetMapping("/descargar_informe")
	public String listar(Model model) {
		List<ventas> Ventas = service.listar();
		model.addAttribute("Ventas", Ventas);
		return "7-3 Dashboard-Administrador descargar informe";
	}
	
	
	//AGREGAR//
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("Ventas", new ventas());
		return "10 Formulario de compra";
	}
	
	@PostMapping("/guardar")
	public String save(@Validated ventas v, Model model) {
		service.guardar(v);
		return "redirect:/inicio/inicio";
	}
	
		
	//ELIMINAR//
		@GetMapping("/eliminar/{ID_Venta}")
		public String delete(Model model, @PathVariable int ID_Venta) {
			service.delete(ID_Venta);
			return "redirect:/descargar/descargar_informe";
		}

}
