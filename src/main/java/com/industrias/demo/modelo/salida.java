package com.industrias.demo.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salida")

public class salida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Salida;
	private Date Fecha_y_hora_salida;
	
	public salida() {

	}

	public salida(int iD_Salida, Date fecha_y_hora_salida) {
		super();
		ID_Salida = iD_Salida;
		Fecha_y_hora_salida = fecha_y_hora_salida;
	}

	public int getID_Salida() {
		return ID_Salida;
	}

	public Date getFecha_y_hora_salida() {
		return Fecha_y_hora_salida;
	}

	public void setID_Salida(int iD_Salida) {
		ID_Salida = iD_Salida;
	}

	public void setFecha_y_hora_salida(Date fecha_y_hora_salida) {
		Fecha_y_hora_salida = fecha_y_hora_salida;
	}
	
	

}
