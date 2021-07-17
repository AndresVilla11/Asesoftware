package com.example.mechanical.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MARCAS")
public class Brand implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODIGO")
	private int code;
	
	@Column(name = "NOMBRE_MARCA")
	private int brandName;
	
	@OneToMany( targetEntity=Vehicle.class, mappedBy="brand", fetch = FetchType.LAZY)
	private List<Vehicle> vehicle;

	public Brand(int code, int brandName, List<Vehicle> vehicle) {
		super();
		this.code = code;
		this.brandName = brandName;
		this.vehicle = vehicle;
	}

	public Brand() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getBrandName() {
		return brandName;
	}

	public void setBrandName(int brandName) {
		this.brandName = brandName;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Brand [code=" + code + ", brandName=" + brandName + "]";
	}

	
}
