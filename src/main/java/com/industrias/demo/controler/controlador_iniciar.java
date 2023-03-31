package com.industrias.demo.controler;

import com.industrias.demo.modelo.Validacion;
import com.industrias.demo.modelo.usuarios;
import com.industrias.demo.service.IvalidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (path = "/iniciarSesion",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_iniciar {

	@ModelAttribute("usuario")
	public Validacion crearValidacion(){
		return new Validacion();
	}
	@RequestMapping("/iniciar_sesion")
	public String start() {
		return "4 Iniciar";	
		
	}

	@Autowired
	private IvalidationService validador;
	@PostMapping("/login")

	public String Logueo(Validacion v, Model model){
		model.addAttribute("usuario", new Validacion());
		usuarios u = validador.ValidarUsuario(v);
		if (u == null){
			return "4 Iniciar.html";
		}
		else {
			return "7 Dashboard-Administrador.html";
		}
	}

}
