package com.example.mechanical.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "VEHICULOS")
public class Vehicle implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "PLACA")
	private int plate;
	@Column(name = "COLOR")
	private int color;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "COD_MARCA", referencedColumnName = "CODIGO", insertable = true, updatable = false)
	Brand brand;

	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn (name="CLI_DOCUMENTO", referencedColumnName = "DOCUMENTO",insertable = true, updatable = false),
		@JoinColumn (name="CLI_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO",insertable = true, updatable = false)
	})
	Client client;
	
	@OneToMany( targetEntity=Maintenance.class, mappedBy="vehicle", fetch = FetchType.LAZY)
	private List<Maintenance> mantenimiento;

	public Vehicle(int plate, int color, Brand brand, Client client) {
		super();
		this.plate = plate;
		this.color = color;
		this.brand = brand;
		this.client = client;
	}

	public Vehicle() {
		super();
	}

	public int getPlate() {
		return plate;
	}

	public void setPlate(int plate) {
		this.plate = plate;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", color=" + color + "]";
	}
	
}
