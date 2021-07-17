package com.example.mechanical.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.mechanical.dtos.MaintenanceRequest;
import com.example.mechanical.models.Maintenance;
import com.example.mechanical.repositories.IMaintenanceRepository;
import com.example.mechanical.services.IMaintenanceService;
import com.example.mechanical.utils.Mapper;

@Service
public class MaintenanceServiceImpl implements IMaintenanceService{
	
	@Value("${facturation.iva}")
	private Double iva;
	
	@Autowired
	private IMaintenanceRepository maintenanceRepository;

	@Override
	public Maintenance findMechanicalById(Long id) {
		return maintenanceRepository.findById(id).orElse(null);
	}

	@Override
	public List<Maintenance> getMechanical() {
		return maintenanceRepository.findAll();
	}

	@Override
	public Maintenance saveMechanical(MaintenanceRequest maintenanceRequest) {
		Maintenance maintenance = Mapper.mapperRequestToModelMaintenance(maintenanceRequest);
		return maintenanceRepository.save(maintenance);
	}

	@Override
	public void delete(Long id) {
		maintenanceRepository.deleteById(id);
	}

}
