package com.example.mechanical.dtos;

import javax.validation.constraints.NotNull;

public class ServiciosMantenimientoRequest {

	@NotNull
	private int codigo;
	@NotNull
	private int tiempoEstimado;
	@NotNull
	private int codigoMantenimiento;

	public ServiciosMantenimientoRequest(int codigo, int tiempoEstimado, int codigoMantenimiento) {
		super();
		this.codigo = codigo;
		this.tiempoEstimado = tiempoEstimado;
		this.codigoMantenimiento = codigoMantenimiento;
	}

	public ServiciosMantenimientoRequest() {
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

	public int getCodigoMantenimiento() {
		return codigoMantenimiento;
	}

	public void setCodigoMantenimiento(int codigoMantenimiento) {
		this.codigoMantenimiento = codigoMantenimiento;
	}

	@Override
	public String toString() {
		return "ServiciosMantenimientoRequest [codigo=" + codigo + ", tiempoEstimado=" + tiempoEstimado
				+ ", codigoMantenimiento=" + codigoMantenimiento + "]";
	}

}
