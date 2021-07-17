package com.example.mechanical.models;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "MANTENIMIENTOS")
public class Maintenance implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CODIGO")
	private int codigo;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "FECHA")
	private Date fecha;

	@OneToMany( targetEntity=MaintenanceService.class, mappedBy="mantenimiento", fetch = FetchType.LAZY)
	private List<MaintenanceService> serviciosMantenimiento;
	
	@OneToMany( targetEntity=PartsMechanical.class, mappedBy="maintenance", fetch = FetchType.LAZY)
	private List<PartsMechanical> partsMechanical;
	
	@OneToMany( targetEntity=Photos.class, mappedBy="maintenance", fetch = FetchType.LAZY)
	private List<Photos> photos;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn (name="MEC_DOCUMENTO", referencedColumnName = "DOCUMENTO",insertable = true, updatable = false),
		@JoinColumn (name="MEC_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO",insertable = true, updatable = false)
	})
	Mechanical mechanical;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn (name="COD_PLACA", referencedColumnName = "PLACA",insertable = true, updatable = false)
	Vehicle vehicle;

	public Maintenance(int codigo, String estado, Date fecha, List<MaintenanceService> serviciosMantenimiento,
			List<PartsMechanical> partsMechanical, List<Photos> photos, Mechanical mechanical, Vehicle vehicle) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.fecha = fecha;
		this.serviciosMantenimiento = serviciosMantenimiento;
		this.partsMechanical = partsMechanical;
		this.photos = photos;
		this.mechanical = mechanical;
		this.vehicle = vehicle;
	}

	public Maintenance() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<MaintenanceService> getServiciosMantenimiento() {
		return serviciosMantenimiento;
	}

	public void setServiciosMantenimiento(List<MaintenanceService> serviciosMantenimiento) {
		this.serviciosMantenimiento = serviciosMantenimiento;
	}

	public List<PartsMechanical> getPartsMechanical() {
		return partsMechanical;
	}

	public void setPartsMechanical(List<PartsMechanical> partsMechanical) {
		this.partsMechanical = partsMechanical;
	}

	public List<Photos> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}

	public Mechanical getMechanical() {
		return mechanical;
	}

	public void setMechanical(Mechanical mechanical) {
		this.mechanical = mechanical;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Maintenance [codigo=" + codigo + ", estado=" + estado + ", fecha=" + fecha + "]";
	}

}
