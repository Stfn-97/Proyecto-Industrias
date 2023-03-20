package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")

public class proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Proveedor;
	private String Nombre_Proveedor;
	private String Direccion_Proveedor;
	private String Email_Proveedor;
	private int Telefono_Proveedor;
	
	public proveedores() {

	}

	public proveedores(int iD_Proveedor, String nombre_Proveedor, String direccion_Proveedor, String email_Proveedor,
			int telefono_Proveedor) {
		super();
		ID_Proveedor = iD_Proveedor;
		Nombre_Proveedor = nombre_Proveedor;
		Direccion_Proveedor = direccion_Proveedor;
		Email_Proveedor = email_Proveedor;
		Telefono_Proveedor = telefono_Proveedor;
	}

	public int getID_Proveedor() {
		return ID_Proveedor;
	}

	public String getNombre_Proveedor() {
		return Nombre_Proveedor;
	}

	public String getDireccion_Proveedor() {
		return Direccion_Proveedor;
	}

	public String getEmail_Proveedor() {
		return Email_Proveedor;
	}

	public int getTelefono_Proveedor() {
		return Telefono_Proveedor;
	}

	public void setID_Proveedor(int iD_Proveedor) {
		ID_Proveedor = iD_Proveedor;
	}

	public void setNombre_Proveedor(String nombre_Proveedor) {
		Nombre_Proveedor = nombre_Proveedor;
	}

	public void setDireccion_Proveedor(String direccion_Proveedor) {
		Direccion_Proveedor = direccion_Proveedor;
	}

	public void setEmail_Proveedor(String email_Proveedor) {
		Email_Proveedor = email_Proveedor;
	}

	public void setTelefono_Proveedor(int telefono_Proveedor) {
		Telefono_Proveedor = telefono_Proveedor;
	}
	
	
}
