package com.industrias.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.industrias.demo.interfaceService.IproductosService;
import com.industrias.demo.interfaces.Iproductos;
import com.industrias.demo.modelo.productos;

@Service
public class productosService implements IproductosService{

	//METODO LISTAR
		@Autowired
		private Iproductos data;

		@Override
		public List<productos> listar() {
			
			return (List<productos>)data.findAll();
		}



		@Override
		public java.util.Optional<productos> listarId(int ID_Producto) {
		return data.findById(ID_Producto);
		}





		@Override
		public int guardar(productos p) {
		int res=0;
		productos Productos=data.save(p);
		if(!Productos.equals(null)) {
		res = 1;
		}
		return res;
		}





		@Override
		public void delete(int ID_Producto) {
		data.deleteById(ID_Producto);

		}
	
}
