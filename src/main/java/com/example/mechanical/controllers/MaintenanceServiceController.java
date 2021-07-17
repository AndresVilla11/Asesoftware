package com.example.mechanical.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mechanical.dtos.ServiciosMantenimientoRequest;
import com.example.mechanical.services.IServiciosMantenimientoService;

@RestController
@RequestMapping("/index")
@CrossOrigin(origins = {"*"})
public class MaintenanceServiceController {
	
	private final static Logger LOG = LoggerFactory.getLogger(MechanicalController.class);
	
	@Autowired
	private IServiciosMantenimientoService serviciosMantenimientoService;
	
	@PostMapping("/service")
	public ResponseEntity<String> create(@RequestBody @Valid ServiciosMantenimientoRequest serviciosMantenimientoRequest){
		try {
			LOG.info(serviciosMantenimientoRequest.toString());
			serviciosMantenimientoService.saveMechanical(serviciosMantenimientoRequest);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
