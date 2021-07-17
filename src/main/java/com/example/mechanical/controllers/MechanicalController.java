package com.example.mechanical.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mechanical.dtos.MechanicalRequest;
import com.example.mechanical.dtos.MechanicalResponse;
import com.example.mechanical.models.Mechanical;
import com.example.mechanical.services.IMechanicalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/index")
@CrossOrigin(origins = {"*"})
public class MechanicalController {
	
	private final static Logger LOG = LoggerFactory.getLogger(MechanicalController.class);
	
	@Autowired
	private IMechanicalService mechanicalService;
	
	@GetMapping("/mechanical")
	public List<MechanicalResponse> form(){
		try {
			return mechanicalService.listMechanical();
		}
		catch(Exception e){
		//Solo usar loggers
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@GetMapping("/free")
	public List<Mechanical> free(){
		try {
			return mechanicalService.getMechanical();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@PostMapping("/mechanical")
	public ResponseEntity<String> create(@RequestBody @Valid MechanicalRequest mechanical) {
		try {
			LOG.info(mechanical.toString());
			mechanicalService.saveMechanical(mechanical);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		}
		catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}