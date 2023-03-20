package com.industrias.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.industrias.demo.interfaceService.IventasService;
import com.industrias.demo.interfaces.Iventas;
import com.industrias.demo.modelo.ventas;

@Service
public class ventasService implements IventasService{

	//METODO LISTAR
	@Autowired
	private Iventas data;

	@Override
	public List<ventas> listar() {

	return (List<ventas>)data.findAll();
	}





	@Override
	public java.util.Optional<ventas> listarId(int ID_Venta) {
	return data.findById(ID_Venta);
	}





	@Override
	public int guardar(ventas v) {
	int res=0;
	ventas Ventas=data.save(v);
	if(!Ventas.equals(null)) {
	res = 1;
	}
	return res;
	}





	@Override
	public void delete(int ID_Venta) {
	data.deleteById(ID_Venta);

	}
	
	
}
