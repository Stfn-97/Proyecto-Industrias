package com.industrias.demo.modelo;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_Usuario;
	private String Nombres;
	private String Apellidos;
	private String email;
	private String Telefono;
	private int Documento;
	private String Direccion;
	private String Ciudad;
	private String password;
	private Long ID_rol;

	public usuarios() {
	}

	public usuarios(Integer ID_Usuario, String nombres, String apellidos, String email, String telefono, int documento, String direccion, String ciudad, String password, Long ID_rol) {
		this.ID_Usuario = ID_Usuario;
		Nombres = nombres;
		Apellidos = apellidos;
		this.email = email;
		Telefono = telefono;
		Documento = documento;
		Direccion = direccion;
		Ciudad = ciudad;
		this.password = password;
		this.ID_rol = ID_rol;
	}

	public Integer getID_Usuario() {
		return ID_Usuario;
	}

	public void setID_Usuario(Integer ID_Usuario) {
		this.ID_Usuario = ID_Usuario;
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
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getID_rol() {
		return ID_rol;
	}

	public void setID_rol(Long ID_rol) {
		this.ID_rol = ID_rol;
	}
}