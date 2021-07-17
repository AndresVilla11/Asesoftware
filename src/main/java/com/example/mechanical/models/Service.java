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
@Table(name = "SERVICIOS")
public class Service implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CODIGO")
	private int code;
	
	@Column(name = "NOMBRE_SERVICIO")
	private int serviceName;
	
	@Column(name = "PRECIO")
	private int price;
	
	@OneToMany( targetEntity=MaintenanceService.class, mappedBy="service", fetch = FetchType.LAZY)
	private List<MaintenanceService> maintenanceService;

	public Service(int code, int serviceName, int price, List<MaintenanceService> maintenanceService) {
		super();
		this.code = code;
		this.serviceName = serviceName;
		this.price = price;
		this.maintenanceService = maintenanceService;
	}

	public Service() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getServiceName() {
		return serviceName;
	}

	public void setServiceName(int serviceName) {
		this.serviceName = serviceName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<MaintenanceService> getMaintenanceService() {
		return maintenanceService;
	}

	public void setMaintenanceService(List<MaintenanceService> maintenanceService) {
		this.maintenanceService = maintenanceService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Service [code=" + code + ", serviceName=" + serviceName + ", price=" + price + "]";
	}
	
	
}
