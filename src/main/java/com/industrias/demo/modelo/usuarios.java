package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Usuario;
	private String Nombres;
	private String Apellidos;
	private String Email;
	private int Telefono;
	private int Documento;
	private String Direccion;
	private String Ciudad;

	public usuarios() {

	}

	public usuarios(int iD_Usuario, String nombres, String apellidos, String email, int telefono, int documento,
			String direccion, String ciudad) {
		super();
		ID_Usuario = iD_Usuario;
		Nombres = nombres;
		Apellidos = apellidos;
		Email = email;
		Telefono = telefono;
		Documento = documento;
		Direccion = direccion;
		Ciudad = ciudad;
	}

	public int getID_Usuario() {
		return ID_Usuario;
	}

	public void setID_Usuario(int iD_Usuario) {
		ID_Usuario = iD_Usuario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public int getDocumento() {
		return Documento;
	}

	public void setDocumento(int documento) {
		Documento = documento;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
}