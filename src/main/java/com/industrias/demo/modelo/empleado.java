package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Empleado;
	
	@ManyToOne
	@JoinColumn(name = "Usuarios_ID_Usuario")
	usuarios usuario;

	public empleado() {

	}

	public empleado(int iD_Empleado, com.industrias.demo.modelo.usuarios usuario) {
		super();
		ID_Empleado = iD_Empleado;
		this.usuario = usuario;
	}

	public int getID_Empleado() {
		return ID_Empleado;
	}

	public usuarios getUsuario() {
		return usuario;
	}

	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}

	public void setUsuario(usuarios usuario) {
		this.usuario = usuario;
	}

}
