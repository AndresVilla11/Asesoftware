package com.example.mechanical.dtos;

import java.util.Date;

import javax.validation.constraints.NotNull;


public class MaintenanceRequest {
	
	@NotNull
	private int codigo;
	
	//Limitar las entradas, es decir, que solo sea 1, 2, 3
	private String estado;
	
	@NotNull
	private Date fecha;
	
	@NotNull
	private int mecTipoDocumento;
	
	@NotNull
	private int mecDocumento;
	
	public MaintenanceRequest(int codigo, String estado, Date fecha, int mecTipoDocumento, int mecDocumento) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.fecha = fecha;
		this.mecTipoDocumento = mecTipoDocumento;
		this.mecDocumento = mecDocumento;
	}

	public MaintenanceRequest() {
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

	public int getMecTipoDocumento() {
		return mecTipoDocumento;
	}

	public void setMecTipoDocumento(int mecTipoDocumento) {
		this.mecTipoDocumento = mecTipoDocumento;
	}

	public int getMecDocumento() {
		return mecDocumento;
	}

	public void setMecDocumento(int mecDocumento) {
		this.mecDocumento = mecDocumento;
	}

	@Override
	public String toString() {
		return "MaintenanceRequest [codigo=" + codigo + ", estado=" + estado + ", fecha=" + fecha
				+ ", mecTipoDocumento=" + mecTipoDocumento + ", mecDocumento=" + mecDocumento + "]";
	}
	
	
}
