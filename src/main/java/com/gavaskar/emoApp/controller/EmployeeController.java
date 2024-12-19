package com.gavaskar.emoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gavaskar.emoApp.entity.Employee;

import com.gavaskar.emoApp.service.EmployeeServiceInterface;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceInterface empService;
	
	@PostMapping()
	public Employee createEmployee( @Validated @RequestBody Employee employee) {
		
		return empService.create(employee);
	}
	
	@GetMapping("/emp")
	public List<Employee> getEmployee() {
		return empService.get();
	}
	@GetMapping("/getempid/{id}")
	public Employee getempid(@PathVariable long id) {
		return empService.getId(id);
	}
	@PutMapping("/update/{id}")
	public Employee updateEmp(@PathVariable long id, @RequestBody Employee employee){
		return empService.update(id,employee);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteemp(@PathVariable long id) {
		empService.deleteEmp(id);
	}
	
	
	
	}
	


	
	


