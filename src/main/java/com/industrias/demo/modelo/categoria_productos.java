package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_productos")
public class categoria_productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Categoria;
	private String Nombre_categoria;
	private String Tipo;
	private String Estado;
	
	public categoria_productos() {

	}

	public categoria_productos(int iD_Categoria, String nombre_categoria, String tipo, String estado) {
		super();
		ID_Categoria = iD_Categoria;
		Nombre_categoria = nombre_categoria;
		Tipo = tipo;
		Estado = estado;
	}

	public int getID_Categoria() {
		return ID_Categoria;
	}

	public String getNombre_categoria() {
		return Nombre_categoria;
	}

	public String getTipo() {
		return Tipo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setID_Categoria(int iD_Categoria) {
		ID_Categoria = iD_Categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		Nombre_categoria = nombre_categoria;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	
}
