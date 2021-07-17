package com.example.mechanical.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class MechanicalRequest {

	@NotNull
	private String primerNombre;

	private String segundoNombre;

	@NotNull
	private String primerApellido;

	private String segundoApellido;

	@NotNull
	private String tipoDocumento;

	@NotNull
	private int documento;

	@NotNull
	private String celular;

	@NotNull
	private String direccion;

	@NotNull
	@Pattern(regexp = "^[\\w-+]+(\\.[\\w-]{1,62}){0,126}@[\\w-]{1,63}(\\.[\\w-]{1,62})+/[\\w-]+$")
	private String email;

	@NotNull
	private String estado;

	public MechanicalRequest(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String tipoDocumento, int documento, String celular, String direccion, String email, String estado) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
		this.estado = estado;
	}

	public MechanicalRequest() {
		super();
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
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

	@Override
	public String toString() {
		return "Mechanical [primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", tipoDocumento=" + tipoDocumento
				+ ", documento=" + documento + ", celular=" + celular + ", direccion=" + direccion + ", email=" + email
				+ ", estado=" + estado + "]";
	}

}
