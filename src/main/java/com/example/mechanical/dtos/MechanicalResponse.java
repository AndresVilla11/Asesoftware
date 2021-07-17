package com.example.mechanical.dtos;

import com.example.mechanical.models.Mechanical;

public class MechanicalResponse {
	
	private Mechanical mechanical;
	private Integer tiempoTotal;
	
	public MechanicalResponse(Mechanical mechanical, Integer tiempoTotal) {
		super();
		this.mechanical = mechanical;
		this.tiempoTotal = tiempoTotal;
	}

	public MechanicalResponse() {
		super();
	}

	public Mechanical getMechanical() {
		return mechanical;
	}

	public void setMechanical(Mechanical mechanical) {
		this.mechanical = mechanical;
	}

	public Integer getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(Integer tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	@Override
	public String toString() {
		return "MechanicalResponse [mechanical=" + mechanical + ", tiempoTotal=" + tiempoTotal + "]";
	}
	
	
}
