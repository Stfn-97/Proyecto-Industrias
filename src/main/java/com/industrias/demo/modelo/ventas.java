package com.industrias.demo.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")

public class ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Venta;
	private Date Fecha_y_hora_venta;
	private int Unidades_adquiridas;
	private double Precio_unidad;
	private double Precio_total;
	
	public ventas() {
		
	}

	public ventas(int iD_Venta, Date fecha_y_hora_venta, int unidades_adquiridas, double precio_unidad,
			double precio_total) {
		super();
		ID_Venta = iD_Venta;
		Fecha_y_hora_venta = fecha_y_hora_venta;
		Unidades_adquiridas = unidades_adquiridas;
		Precio_unidad = precio_unidad;
		Precio_total = precio_total;
	}

	public int getID_Venta() {
		return ID_Venta;
	}

	public void setID_Venta(int iD_Venta) {
		ID_Venta = iD_Venta;
	}

	public Date getFecha_y_hora_venta() {
		return Fecha_y_hora_venta;
	}

	public void setFecha_y_hora_venta(Date fecha_y_hora_venta) {
		Fecha_y_hora_venta = fecha_y_hora_venta;
	}

	public int getUnidades_adquiridas() {
		return Unidades_adquiridas;
	}

	public void setUnidades_adquiridas(int unidades_adquiridas) {
		Unidades_adquiridas = unidades_adquiridas;
	}

	public double getPrecio_unidad() {
		return Precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		Precio_unidad = precio_unidad;
	}

	public double getPrecio_total() {
		return Precio_total;
	}

	public void setPrecio_total(double precio_total) {
		Precio_total = precio_total;
	}

	
	
	
	
}


