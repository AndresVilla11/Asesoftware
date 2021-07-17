package com.example.mechanical.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REPUESTOS")
public class Parts implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CODIGO")
	private int code;
	
	@Column(name="NOMBRE_REPUESTO")
	private int partName;
	
	@Column(name="PRECIO_UNITARIO")
	private int priceUnit;
	
	@Column(name="UNIDADES_INVENTARIO")
	private int inventoryUnit;
	
	@Column(name="PROVEEDOR")
	private int supplier;
	
	@OneToMany( targetEntity=PartsMechanical.class, mappedBy="parts", fetch = FetchType.LAZY)
	private List<PartsMechanical> partsMechanical;

	public Parts(int code, int partName, int priceUnit, int inventoryUnit, int supplier,
			List<PartsMechanical> partsMechanical) {
		super();
		this.code = code;
		this.partName = partName;
		this.priceUnit = priceUnit;
		this.inventoryUnit = inventoryUnit;
		this.supplier = supplier;
		this.partsMechanical = partsMechanical;
	}

	public Parts() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getPartName() {
		return partName;
	}

	public void setPartName(int partName) {
		this.partName = partName;
	}

	public int getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(int priceUnit) {
		this.priceUnit = priceUnit;
	}

	public int getInventoryUnit() {
		return inventoryUnit;
	}

	public void setInventoryUnit(int inventoryUnit) {
		this.inventoryUnit = inventoryUnit;
	}

	public int getSupplier() {
		return supplier;
	}

	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}

	public List<PartsMechanical> getPartsMechanical() {
		return partsMechanical;
	}

	public void setPartsMechanical(List<PartsMechanical> partsMechanical) {
		this.partsMechanical = partsMechanical;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Parts [code=" + code + ", partName=" + partName + ", priceUnit=" + priceUnit + ", inventoryUnit="
				+ inventoryUnit + ", supplier=" + supplier + ", partsMechanical=" + partsMechanical + "]";
	}

}
