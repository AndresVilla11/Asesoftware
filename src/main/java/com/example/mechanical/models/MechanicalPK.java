package com.example.mechanical.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class MechanicalPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "TIPO_DOCUMENTO")
	@Size(max = 255)
	private String tipoDocumento;
	
	@Column(name = "DOCUMENTO")
	@Size(max = 255)
	private int documento;
	
	public MechanicalPK(String tipoDocumento, int documento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public MechanicalPK() {
		super();
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

	@Override
	public String toString() {
		return "MechanicalPK [tipoDocumento=" + tipoDocumento + ", documento=" + documento + "]";
	}
	
	
}
