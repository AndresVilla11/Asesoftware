package com.example.mechanical.services;

import java.util.List;

import com.example.mechanical.dtos.MechanicalRequest;
import com.example.mechanical.dtos.MechanicalResponse;
import com.example.mechanical.models.Mechanical;

public interface IMechanicalService {
	
	Mechanical findMechanicalById(Long id);
	List<Mechanical> getMechanical();
	Mechanical saveMechanical(MechanicalRequest mechanicalRequest);
	void delete(Long id);
	List<MechanicalResponse> listMechanical();
	
}
