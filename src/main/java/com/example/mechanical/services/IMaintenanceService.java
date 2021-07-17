package com.example.mechanical.services;

import java.util.List;

import com.example.mechanical.dtos.MaintenanceRequest;
import com.example.mechanical.models.Maintenance;

public interface IMaintenanceService {
	
	Maintenance findMechanicalById(Long id);
	List<Maintenance> getMechanical();
	Maintenance saveMechanical(MaintenanceRequest maintenanceRequest);
	void delete(Long id);

}
