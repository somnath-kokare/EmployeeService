package com.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Service")
public class Employee {
	
	@Id
	@Column(name="Employee_ID")
	private String empId;
	
	@Column(name="Employee_Name")
	private String name;
	
	@Column(name="Employee_City")
	private String city;
	
	@Column(name="Employee_Salary")
	private String salary;
	
	@Column(name="Employee_About")
	private String about;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", salary=" + salary + ", about="
				+ about + "]";
	}
	
	

}
