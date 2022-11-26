package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empSer;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {

		Employee saveEmp = empSer.saveEmployee(emp);

		return ResponseEntity.ok().body(saveEmp);
	}

	@GetMapping("/get")
	public List<Employee> getAllEmployeeDetails() {

		List<Employee> getallEmp = empSer.getAllEmployee();

		return getallEmp;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id") String id) {

		Optional<Employee> getById = empSer.getEmployeeById(id);

		return ResponseEntity.ok().body(getById);

	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") String id) {

		empSer.deleteEmployeeById(id);
	}

}
