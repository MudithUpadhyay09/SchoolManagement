package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.schoolmanagement.entities.Principle;
import com.api.schoolmanagement.service.PrincipleService;

@RestController
public class PrincipleController {
	
	@Autowired
	private PrincipleService principleService;
	
	@GetMapping("/getprinciple")
	public List<Principle> getAllPrinciple(){
		return principleService.getAllPrinciple();
	}
	
	@GetMapping("/getprinciple/{id}")
	public Principle getPrinciple(@PathVariable Long id) {
		return principleService.getPrinciple(id);
	}
	
	@PostMapping("/addprinciple")
	public void addPrinciple(@RequestBody Principle principle) {
		principleService.addPrinciple(principle);
	}


}
