package com.cg.backgroundverification.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.service.BcgService;

@RestController
@RequestMapping("/BackGroundVerification")
@CrossOrigin("http://localhost:4200")
public class BackgroundVerificationController
{

	@Autowired
	BcgService bcgservice;
	
	@GetMapping(value="/GetDocumentById/{enter-id}")
	public Optional<EmployeeDocumentDto>getById(@PathVariable("enter-id")  int id)
	{
	       return bcgservice.getById(id);
	}
	
}
