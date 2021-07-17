package com.example.mechanical.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MECANICOS")
public class Mechanical implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MechanicalPK mechanicalPK;
	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;
	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;
	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;
	@Column(name = "CELULAR")
	private String celular;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ESTADO")
	private String estado;
	
	@OneToMany( targetEntity=Maintenance.class, mappedBy="mechanical", fetch = FetchType.LAZY)
	private List<Maintenance> mantenimiento;
	
	
	public Mechanical(MechanicalPK mechanicalPK, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String celular, String direccion, String email, String estado) {
		super();
		this.mechanicalPK = mechanicalPK;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
		this.estado = estado;
	}

	public Mechanical() {
		super();
	}

	public MechanicalPK getMechanicalPK() {
		return mechanicalPK;
	}

	public void setMechanicalPK(MechanicalPK mechanicalPK) {
		this.mechanicalPK = mechanicalPK;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Maintenance> getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(List<Maintenance> mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Override
	public String toString() {
		return "Mechanical [mechanicalPK=" + mechanicalPK + ", primerNombre=" + primerNombre + ", segundoNombre="
				+ segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", celular=" + celular + ", direccion=" + direccion + ", email=" + email + ", estado=" + estado
				+ ", mantenimiento=" + mantenimiento + "]";
	}

}
