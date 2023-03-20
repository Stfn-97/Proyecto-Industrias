package com.industrias.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.industrias.demo.modelo.ventas;

public interface IventasService {
	public List<ventas>listar();
	public Optional<ventas>listarId(int ID_Venta);
	public int guardar(ventas v);
	public void delete(int ID_Venta);
}
