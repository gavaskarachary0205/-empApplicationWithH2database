package com.gavaskar.emoApp.service;

import java.util.List;

import com.gavaskar.emoApp.entity.Employee;

public interface EmployeeServiceInterface {

	Employee create(Employee employee);

	List<Employee> get();

	Employee getId(long id);

	Employee update(long id, Employee employee);

	void deleteEmp(long id);

}
