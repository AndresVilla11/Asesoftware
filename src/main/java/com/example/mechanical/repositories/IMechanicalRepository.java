package com.example.mechanical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mechanical.models.Mechanical;

@Repository
public interface IMechanicalRepository extends JpaRepository<Mechanical, Long> {

	@Query(
			value = "select sum(tiempo_estimado) as tiempo_total from servicios_x_mantenimiento join mantenimientos ma on ma.codigo = cod_mantenimiento where mec_documento = ?1 and mec_tipo_documento = ?2 and MONTH(DATE_SUB((CURDATE()),INTERVAL 1 MONTH)) = MONTH(FECHA)", 
			nativeQuery = true)
	public Integer searchPriority(int documento, String tipoDocumento);
}
