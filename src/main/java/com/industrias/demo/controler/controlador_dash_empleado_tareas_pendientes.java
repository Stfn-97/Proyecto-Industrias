package com.industrias.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (path = "/tareas",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_dash_empleado_tareas_pendientes {

	@RequestMapping("/empleado_tareas_pendientes")
	public String start() {
		return "9-3 Dashboard-Empleado tareas pendientes";	

	}
	

}
