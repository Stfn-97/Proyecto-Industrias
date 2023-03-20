package com.industrias.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (path = "/compras",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_dash_cliente_mis_compras {
	
	@RequestMapping("/cliente_mis_compras")
	public String start() {
		return "8-3 Dashboard-Cliente tus compras";	
	

	}
	
}
