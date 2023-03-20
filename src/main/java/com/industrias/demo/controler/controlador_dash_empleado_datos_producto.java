package com.industrias.demo.controler;

import java.io.IOException;
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

import com.industrias.demo.interfaceService.IproductosService;
import com.industrias.demo.modelo.productos;
import com.industrias.demo.pdf.datosProductosPdf;
import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping (path = "/datos",method = {RequestMethod.POST,RequestMethod.GET,RequestMethod.HEAD,RequestMethod.PUT})
@CrossOrigin(origins = "*")
public class controlador_dash_empleado_datos_producto {
	
	@Autowired
	private IproductosService service;
	
	//LISTAR//
	@GetMapping("/empleado_datos_productos")
	public String listar(Model model) {
		List<productos>Productos = service.listar();
		model.addAttribute("Productos", Productos);		
		return"9-2 Dashboard-Empleado datos de productos";
	}
	
	//AGREGAR//
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("Productos", new productos());
		return "14 Formulario para agregar productos";
	}
	@PostMapping("/guardar")
	public String save(@Validated productos p, Model model) {
		service.guardar(p);
		return "redirect:/datos/empleado_datos_productos";
	}
	
	
	//EDITAR//
	@GetMapping("/editar/{ID_Producto}")
	public String editar(@PathVariable int ID_Producto, Model model) {
		java.util.Optional<productos>Productos=service.listarId(ID_Producto);
		model.addAttribute("Productos", Productos);
		return "13 Formulario de editar productos";
	}
	
	//ELIMINAR//
	@GetMapping("/eliminar/{ID_Producto}")
	public String delete(Model model, @PathVariable int ID_Producto) {
		service.delete(ID_Producto);
		return "redirect:/datos/empleado_datos_productos";
	}
	
	@GetMapping("/empleado_datos_productos/exportar")
	public void exportarPDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		String claveEncabezado = "Content-Disposition";
		String valorEncabezado = "attachment; filename=datos_de_productos.pdf";
		
		response.setHeader(claveEncabezado, valorEncabezado);
		
		List<productos>Productos = service.listar();
		
		datosProductosPdf exporter = new datosProductosPdf(Productos);
		exporter.exportar(response);
	}
	
}
