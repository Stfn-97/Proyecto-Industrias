package com.industrias.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping (path = "/aInventario",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
@Controller
public class controlador_dash_administrador_inventario {
	
	@RequestMapping("/administrador_inventario")
	public String start() {
		return "7-2 Dashboard-Administrador ver inventario";

	}

}
