package com.industrias.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (path = "/recuperarSesion",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_recuperar {

	@RequestMapping("/recuperar_sesion")
	public String start() {
		return "5 Recuperar";	
		
	}
	
}
