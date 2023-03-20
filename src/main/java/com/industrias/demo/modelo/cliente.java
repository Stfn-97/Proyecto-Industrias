package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Cliente;
	
	@ManyToOne
	@JoinColumn(name = "Usuarios_ID_Usuario")
	usuarios usuario;
	
	public cliente() {

	}

	public cliente(int iD_Cliente, com.industrias.demo.modelo.usuarios usuario) {
		super();
		ID_Cliente = iD_Cliente;
		this.usuario = usuario;
	}

	public int getID_Cliente() {
		return ID_Cliente;
	}

	public usuarios getUsuario() {
		return usuario;
	}

	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}

	public void setUsuario(usuarios usuario) {
		this.usuario = usuario;
	}
	
	
	
}
