package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee emp);

	public List<Employee> getAllEmployee();

	public Optional<Employee> getEmployeeById(String empId);

	public void deleteEmployeeById(String empId);

	
}
