package com.gavaskar.emoApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavaskar.emoApp.entity.Employee;
import com.gavaskar.emoApp.repository.EmployeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeRepository empRepository;

	@Override
	public Employee create(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public List<Employee> get() {
		return empRepository.findAll();
	}

	@Override
	public Employee getId(long id) {
		Optional<Employee> e=empRepository.findById(id);
		return e.get();
	}

	@Override
	public Employee update(long id, Employee employee) {
		Optional<Employee> e=empRepository.findById(id);
		if(e.isPresent()) {
		Employee emp=e.get();
		emp.setName(employee.getName());
		emp.setEmail(employee.getEmail());
		emp.setMobileNumbe(employee.getMobileNumbe());
		return empRepository.save(employee);
		}
		else return null;
	}

	@Override
	public void deleteEmp(long id) {
		empRepository.deleteById(id);
		
		
	}
	
	

	
	
	
	
	

}
