package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Inventario;
	private int Unidades_en_inventario;
	private String Informacion_producto;
	private float Precio_producto;
	
	//@ManyToOne
	//@JoinColumn(name = "productos_id_producto")//
	//productos productos;//

	public inventario() {

	}

	public inventario(int iD_Inventario, int unidades_en_inventario, String informacion_producto, float precio_producto) {
		super();
		ID_Inventario = iD_Inventario;
		Unidades_en_inventario = unidades_en_inventario;
		Informacion_producto = informacion_producto;
		Precio_producto = precio_producto;
	}

	public int getID_Inventario() {
		return ID_Inventario;
	}

	public int getUnidades_en_inventario() {
		return Unidades_en_inventario;
	}

	public String getInformacion_producto() {
		return Informacion_producto;
	}

	public float getPrecio_producto() {
		return Precio_producto;
	}

	public void setID_Inventario(int iD_Inventario) {
		ID_Inventario = iD_Inventario;
	}

	public void setUnidades_en_inventario(int unidades_en_inventario) {
		Unidades_en_inventario = unidades_en_inventario;
	}

	public void setInformacion_producto(String informacion_producto) {
		Informacion_producto = informacion_producto;
	}

	public void setPrecio_producto(float precio_producto) {
		Precio_producto = precio_producto;
	}
	

}
