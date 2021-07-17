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

import com.example.mechanical.dtos.MaintenanceRequest;
import com.example.mechanical.services.IMaintenanceService;

@RestController
@RequestMapping("/index")
@CrossOrigin(origins = {"*"})
public class MaintenanceController {
	
	private final static Logger LOG = LoggerFactory.getLogger(MechanicalController.class);
	
	@Autowired
	private IMaintenanceService maintenanceService;
	
	@PostMapping("/maintenance")
	public ResponseEntity<String> create(@RequestBody @Valid MaintenanceRequest maintenanceRequest){
		try {
			LOG.info("Service to create a maintenance");
			LOG.info("Request: {}", maintenanceRequest.toString());
			maintenanceService.saveMechanical(maintenanceRequest);
			LOG.info("Finished");
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
