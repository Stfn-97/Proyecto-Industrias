package com.industrias.demo.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrada")
public class entrada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Entrada;
	private Date Fecha_y_hora_entrada;
	
	public entrada() {

	}

	public entrada(int iD_Entrada, Date fecha_y_hora_entrada) {
		super();
		ID_Entrada = iD_Entrada;
		Fecha_y_hora_entrada = fecha_y_hora_entrada;
	}

	public int getID_Entrada() {
		return ID_Entrada;
	}

	public Date getFecha_y_hora_entrada() {
		return Fecha_y_hora_entrada;
	}

	public void setID_Entrada(int iD_Entrada) {
		ID_Entrada = iD_Entrada;
	}

	public void setFecha_y_hora_entrada(Date fecha_y_hora_entrada) {
		Fecha_y_hora_entrada = fecha_y_hora_entrada;
	}

	
	
}
