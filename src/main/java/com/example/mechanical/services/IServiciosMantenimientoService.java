package com.example.mechanical.services;

import java.util.List;

import com.example.mechanical.dtos.ServiciosMantenimientoRequest;
import com.example.mechanical.models.MaintenanceService;

public interface IServiciosMantenimientoService {
	
	MaintenanceService findMechanicalById(Long id);
	List<MaintenanceService> getMechanical();
	MaintenanceService saveMechanical(ServiciosMantenimientoRequest serviciosMantenimientoRequest);
	void delete(Long id);
}
