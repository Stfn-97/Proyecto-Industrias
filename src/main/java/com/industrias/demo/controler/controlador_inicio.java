package com.industrias.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (path = "/inicio",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_inicio {

	@RequestMapping("/inicio")
	public String start() {
		return "1_inicio";
	}
	
}
