package com.example.mechanical.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "FOTOS")
public class Photos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CODIGO")
	private int code;
	
	@Column(name="RUTA")
	private int route;

	@JsonIgnore
	@ManyToOne
	@JoinColumn (name="COD_MANTENIMIENTO", referencedColumnName = "CODIGO",insertable = true, updatable = false)
	Maintenance maintenance;

	public Photos(int code, int route, Maintenance maintenance) {
		super();
		this.code = code;
		this.route = route;
		this.maintenance = maintenance;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getRoute() {
		return route;
	}

	public void setRoute(int route) {
		this.route = route;
	}

	public Maintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Photos [code=" + code + ", route=" + route + "]";
	}
	

}
