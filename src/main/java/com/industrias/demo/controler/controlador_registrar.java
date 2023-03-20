package com.industrias.demo.controler;

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

import com.industrias.demo.interfaceService.IusuariosService;
import com.industrias.demo.modelo.usuarios;

@Controller
@RequestMapping (path = "/registrarUsuario",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_registrar {

	@Autowired
	private IusuariosService service;
	
	//AGREGAR//
	@GetMapping("/registrar_usuario")
	public String agregar(Model model) {
		model.addAttribute("Usuarios", new usuarios());
		return "3 Registrar";
	}
	
	@PostMapping("/save")
	public String save(@Validated usuarios u, Model model) {
	service.save(u);
	
	return "redirect:/registrarUsuario/registrar_usuario";
	}


	//EDITAR//
	@GetMapping("/editar/{ID_Usuario}")
	public String editar(@PathVariable int ID_Usuario, Model model) {
	java.util.Optional<usuarios>Usuarios=service.listarId(ID_Usuario);
	model.addAttribute("Usuarios", Usuarios);
	return "3 Resgistrar";
	}

	//ELIMINAR//
	@GetMapping("/eliminar/{ID_Usuario}")
	public String delete(Model model, @PathVariable int ID_Usuario) {
	service.delete(ID_Usuario);
	return "redirect:/registrarUsuario/registrar_usuario";
	}

}