package com.tech.springbootmangodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tech.springbootmangodb.Repository.AppartmentRepository;
import com.tech.springbootmangodb.domain.Appartment;

@RestController
public class AppartmentController {

	@Autowired
	AppartmentRepository appartmentRepository;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/apt/all",method=RequestMethod.GET)
	public List<Appartment> getAll(){
		return appartmentRepository.findAll();
		
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/apt/check",method=RequestMethod.GET)
	public String checkHealth(){
		return "HealthCheck";
		
	}
}
