package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "permisos")
public class permisos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Permiso;
	private String Tipo_Permiso;
	private String Detalle_Permiso;
	private String Estado_Permiso;
	
	@ManyToOne
	@JoinColumn(name = "roles_id__rol")
	roles roles;
	
	public permisos() {

	}

	public permisos(int iD_Permiso, String tipo_Permiso, String detalle_Permiso, String estado_Permiso,
			com.industrias.demo.modelo.roles roles) {
		super();
		ID_Permiso = iD_Permiso;
		Tipo_Permiso = tipo_Permiso;
		Detalle_Permiso = detalle_Permiso;
		Estado_Permiso = estado_Permiso;
		this.roles = roles;
	}

	public int getID_Permiso() {
		return ID_Permiso;
	}

	public String getTipo_Permiso() {
		return Tipo_Permiso;
	}

	public String getDetalle_Permiso() {
		return Detalle_Permiso;
	}

	public String getEstado_Permiso() {
		return Estado_Permiso;
	}

	public roles getRoles() {
		return roles;
	}

	public void setID_Permiso(int iD_Permiso) {
		ID_Permiso = iD_Permiso;
	}

	public void setTipo_Permiso(String tipo_Permiso) {
		Tipo_Permiso = tipo_Permiso;
	}

	public void setDetalle_Permiso(String detalle_Permiso) {
		Detalle_Permiso = detalle_Permiso;
	}

	public void setEstado_Permiso(String estado_Permiso) {
		Estado_Permiso = estado_Permiso;
	}

	public void setRoles(roles roles) {
		this.roles = roles;
	}
	
	

}
