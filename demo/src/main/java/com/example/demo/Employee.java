package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name="EMPLOYEE_ID")
	/* @GeneratedValue(strategy=GenerationType.AUTO) */
    private Integer employeeId;
    @Column(name="EMPLOYEE_NAME")
    private String employeeName;
    @Column(name="EMPLOYEE_EMAIL")
    private String employeeEmail;
    @Column(name="EMPLOYEE_ADDRESS")
    private String employeeAddress;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	
    
    
}