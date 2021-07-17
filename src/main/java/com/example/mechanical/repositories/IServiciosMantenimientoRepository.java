package com.example.mechanical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mechanical.models.MaintenanceService;

@Repository
public interface IServiciosMantenimientoRepository extends JpaRepository<MaintenanceService, Long>{
	
}
