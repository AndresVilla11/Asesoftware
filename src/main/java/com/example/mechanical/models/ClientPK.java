package com.example.mechanical.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class ClientPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "TIPO_DOCUMENTO")
	@Size(max = 255)
	private String tipoDocumento;
	
	@Column(name = "DOCUMENTO")
	@Size(max = 255)
	private int documento;

	public ClientPK(@Size(max = 255) String tipoDocumento, @Size(max = 255) int documento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public ClientPK() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ClientPK [tipoDocumento=" + tipoDocumento + ", documento=" + documento + "]";
	}
	
	
}
