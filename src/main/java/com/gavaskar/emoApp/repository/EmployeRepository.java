package com.gavaskar.emoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavaskar.emoApp.entity.Employee;
@Repository
public interface EmployeRepository extends JpaRepository<Employee,Long> {

}
