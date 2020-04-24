package com.cg.backgroundverification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

public class BackgroundVerificationController {

	@Autowired
	BcgService bcgservice;
	@GetMapping(value="/GetDocumentByName/{enter-name}")
	public ResponseEntity<EmployeeDocumentDto>getById(@PathVariable("enter-name")  String name)
	{
		EmployeeDocumentDto employeedocumentdtoobj=bcgservice.getByName(name);
		ResponseEntity<EmployeeDocumentDto> response=new ResponseEntity<EmployeeDocumentDto>(employeedocumentdtoobj,HttpStatus.OK);
		return response;
	}

}
