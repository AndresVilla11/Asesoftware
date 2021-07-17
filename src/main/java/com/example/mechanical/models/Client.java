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
@Table(name = "CLIENTES")
public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClientPK clientPK;
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
	
	@OneToMany( targetEntity=Vehicle.class, mappedBy="client", fetch = FetchType.LAZY)
	private List<Vehicle> vehicle;

	public Client(ClientPK clientPK, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String celular, String direccion, String email, List<Vehicle> vehicle) {
		super();
		this.clientPK = clientPK;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
		this.vehicle = vehicle;
	}

	public Client() {
		super();
	}

	public ClientPK getClientPK() {
		return clientPK;
	}

	public void setClientPK(ClientPK clientPK) {
		this.clientPK = clientPK;
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
		return "Client [clientPK=" + clientPK + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre
				+ ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", celular=" + celular
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}

	
	
}
