package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "roles")

public class roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Rol;
	private String Tipo_rol;
	private String Cargo;

	public roles() {
	}

	public roles(Long ID_Rol, String tipo_rol, String cargo) {
		this.ID_Rol = ID_Rol;
		Tipo_rol = tipo_rol;
		Cargo = cargo;
	}

	public Long getID_Rol() {
		return ID_Rol;
	}

	public void setID_Rol(Long ID_Rol) {
		this.ID_Rol = ID_Rol;
	}

	public String getTipo_rol() {
		return Tipo_rol;
	}

	public void setTipo_rol(String tipo_rol) {
		Tipo_rol = tipo_rol;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}
}
