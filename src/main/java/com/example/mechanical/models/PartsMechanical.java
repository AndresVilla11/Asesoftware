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
@Table(name = "RESPUESTOS_MANTENIMIENTOS")
public class PartsMechanical implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CODIGO")
	private int code;
	
	@Column(name="UNIDADES")
	private int unit;
	
	@Column(name="TIEMPO_ESTIMADO")
	private int estimatedTime;
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn (name="COD_MANTENIMIENTO", referencedColumnName = "CODIGO",insertable = true, updatable = false)
	Maintenance maintenance;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn (name="COD_REPUESTO", referencedColumnName = "CODIGO",insertable = true, updatable = false)
	Parts parts;

	public PartsMechanical(int code, int unit, int estimatedTime, Maintenance maintenance, Parts parts) {
		super();
		this.code = code;
		this.unit = unit;
		this.estimatedTime = estimatedTime;
		this.maintenance = maintenance;
		this.parts = parts;
	}

	public PartsMechanical() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public Maintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}

	public Parts getParts() {
		return parts;
	}

	public void setParts(Parts parts) {
		this.parts = parts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PartsMechanical [code=" + code + ", unit=" + unit + ", estimatedTime=" + estimatedTime
				+ ", maintenance=" + maintenance + ", parts=" + parts + "]";
	}

	
	
}
