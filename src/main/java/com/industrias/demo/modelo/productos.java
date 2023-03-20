package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Producto;
	private String Nombre_Producto;
	private String Descripcion;
	private String Marca;	
	
	public productos() {

	}

	public productos(int iD_Producto, String nombre_Producto, String descripcion, String marca) {
		super();
		ID_Producto = iD_Producto;
		Nombre_Producto = nombre_Producto;
		Descripcion = descripcion;
		Marca = marca;
	}

	public int getID_Producto() {
		return ID_Producto;
	}

	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}

	public String getNombre_Producto() {
		return Nombre_Producto;
	}

	public void setNombre_Producto(String nombre_Producto) {
		Nombre_Producto = nombre_Producto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}
	
	
	
	
	
}
