package com.estevanhernandes.cruddemo.repository;

import com.estevanhernandes.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
