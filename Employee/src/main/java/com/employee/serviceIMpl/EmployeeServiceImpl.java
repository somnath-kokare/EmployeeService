package com.employee.serviceIMpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee saveEmployee(Employee emp) {

		String randomID = UUID.randomUUID().toString();
		emp.setEmpId(randomID);
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		
		return empRepo.findById(empId);
	}

	@Override
	public void deleteEmployeeById(String empId) {
		// TODO Auto-generated method stub
		empRepo.deleteById(empId);

	}

}
