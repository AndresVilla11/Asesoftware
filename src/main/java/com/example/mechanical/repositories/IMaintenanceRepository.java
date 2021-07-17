package com.example.mechanical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mechanical.models.Maintenance;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long>{

}
