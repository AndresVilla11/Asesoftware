package com.example.mechanical.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mechanical.dtos.MechanicalRequest;
import com.example.mechanical.dtos.MechanicalResponse;
import com.example.mechanical.models.Mechanical;
import com.example.mechanical.repositories.IMechanicalRepository;
import com.example.mechanical.services.IMechanicalService;
import com.example.mechanical.utils.Mapper;

@Service
public class MechanicalServiceImpl implements IMechanicalService {

	@Autowired
	private IMechanicalRepository mechanicalRepository;

	@Override
	public void delete(Long id) {
		mechanicalRepository.deleteById(id);
	}

	@Override
	public Mechanical findMechanicalById(Long id) {
		return mechanicalRepository.findById(id).orElse(null);
	}

	@Override
	public List<Mechanical> getMechanical() {
		return mechanicalRepository.findAll();
	}

	@Override
	public Mechanical saveMechanical(MechanicalRequest mechanicalRequest) {
		Mechanical mechanical = Mapper.mapperRequestToModelMechanical(mechanicalRequest);
		return mechanicalRepository.save(mechanical);
	}

	@Override
	public List<MechanicalResponse> listMechanical() {
		List<Mechanical> mechanicals = mechanicalRepository.findAll();
		if (mechanicals.isEmpty()) {
			return null;
		}
		List<MechanicalResponse> mechanicalResponses = new ArrayList<>();
		for (Mechanical mechanical : mechanicals) {
			if (mechanical.getEstado().equals("1")) {
				Integer totalTime = mechanicalRepository.searchPriority(mechanical.getMechanicalPK().getDocumento(),
						mechanical.getMechanicalPK().getTipoDocumento());
				if(totalTime != null) {
					MechanicalResponse mechanicalResponse = new MechanicalResponse(mechanical, totalTime);
					mechanicalResponses.add(mechanicalResponse);
				}
			}
		}
		Collections.sort(mechanicalResponses, new Comparator<MechanicalResponse>() {
	        public int compare(MechanicalResponse o1, MechanicalResponse o2) {
	            return o1.getTiempoTotal().compareTo(o2.getTiempoTotal());
	        }
	    });
		List<MechanicalResponse> mechanicalPriority = Mapper.mapperModelMechanicalToResponse(mechanicalResponses);
		return mechanicalPriority;
	}

}
