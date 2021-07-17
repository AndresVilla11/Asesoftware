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
@Table(name = "SERVICIOS_X_MANTENIMIENTO")
public class MaintenanceService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODIGO")
	private int codigo;
	@Column(name = "TIEMPO_ESTIMADO")
	private int tiempoEstimado;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "COD_MANTENIMIENTO", referencedColumnName = "CODIGO", insertable = true, updatable = false)
	Maintenance mantenimiento;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "COD_SERVICIO", referencedColumnName = "CODIGO", insertable = true, updatable = false)
	Service service;
	
	public MaintenanceService(int codigo, int tiempoEstimado, Maintenance mantenimiento) {
		super();
		this.codigo = codigo;
		this.tiempoEstimado = tiempoEstimado;
		this.mantenimiento = mantenimiento;
	}
	
	public MaintenanceService() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Maintenance getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Maintenance mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Override
	public String toString() {
		return "ServiciosMantenimiento [codigo=" + codigo + ", tiempoEstimado=" + tiempoEstimado + "]";
	}

}
