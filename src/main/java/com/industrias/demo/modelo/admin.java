package com.industrias.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Admin;
	
	public admin() {

	}

	public admin(int iD_Admin) {
		super();
		ID_Admin = iD_Admin;
	}

	public int getID_Admin() {
		return ID_Admin;
	}

	public void setID_Admin(int iD_Admin) {
		ID_Admin = iD_Admin;
	}
	
	

}
