package com.industrias.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.industrias.demo.modelo.productos;

public interface IproductosService {

	public List<productos>listar();
	public Optional<productos>listarId(int ID_Producto);
	public int guardar(productos p);
	public void delete(int ID_Producto);
	
}
