package com.api.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.schoolmanagement.entities.Ground;
import com.api.schoolmanagement.service.GroundService;

@RestController
public class GroundController {
	
	@Autowired
	private GroundService groundService;
	
	@GetMapping("/getground")
	public List<Ground> getAllGround(){
		return groundService.getAllGround();
	}
	
	@GetMapping("/getground/{id}")
	public Ground getGround(@PathVariable Long id) {
		return groundService.getGround(id);
	}
	
	@PostMapping("/addground")
	public void addGround(@RequestBody Ground ground) {
		groundService.addGround(ground);
	}

}
