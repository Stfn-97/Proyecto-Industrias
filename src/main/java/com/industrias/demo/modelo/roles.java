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
	
	@ManyToOne
	@JoinColumn(name = "usuarios_ID_Usuario")
	usuarios usuario;
	
	public roles() {

	}

	public roles(Long iD_Rol, String tipo_rol, String cargo, usuarios usuario) {
		super();
		ID_Rol = iD_Rol;
		Tipo_rol = tipo_rol;
		Cargo = cargo;
		this.usuario = usuario;
	}

	public Long getID_Rol() {
		return ID_Rol;
	}

	public String getTipo_rol() {
		return Tipo_rol;
	}

	public String getCargo() {
		return Cargo;
	}

	public usuarios getUsuario() {
		return usuario;
	}

	public void setID_Rol(Long iD_Rol) {
		ID_Rol = iD_Rol;
	}

	public void setTipo_rol(String tipo_rol) {
		Tipo_rol = tipo_rol;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public void setUsuario(usuarios usuario) {
		this.usuario = usuario;
	}
	
	

}
