package com.example.mechanical.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mechanical.dtos.ServiciosMantenimientoRequest;
import com.example.mechanical.models.MaintenanceService;
import com.example.mechanical.repositories.IServiciosMantenimientoRepository;
import com.example.mechanical.services.IServiciosMantenimientoService;
import com.example.mechanical.utils.Mapper;

@Service
public class ServiciosMantenimientoServiceImpl implements IServiciosMantenimientoService {

	@Autowired
	private IServiciosMantenimientoRepository servicioRepository;

	@Override
	public MaintenanceService findMechanicalById(Long id) {
		return servicioRepository.findById(id).orElse(null);
	}

	@Override
	public List<MaintenanceService> getMechanical() {
		return servicioRepository.findAll();
	}

	@Override
	public MaintenanceService saveMechanical(ServiciosMantenimientoRequest serviciosMantenimientoRequest) {
		MaintenanceService serviciosMantenimiento = Mapper
				.mapperRequestToModelServiciosMantenimiento(serviciosMantenimientoRequest);
		return servicioRepository.save(serviciosMantenimiento);
	}

	@Override
	public void delete(Long id) {
		servicioRepository.deleteById(id);
	}

}
