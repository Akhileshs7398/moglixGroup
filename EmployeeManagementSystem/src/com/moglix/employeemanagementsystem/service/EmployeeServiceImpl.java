package com.moglix.employeemanagementsystem.service;

import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;
import com.moglix.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeServiceI {
	
	private static EmployeeServiceI employeeServiceI;
	
	EmployeeRepository employeeRepository =  EmployeeRepositoryImpl.getInstance();

		
	public static EmployeeServiceI getInstance() {
		if(employeeServiceI==null) {
			employeeServiceI  = new EmployeeServiceImpl();
			return employeeServiceI;
		}
		else
			return employeeServiceI;
		
	}
	private EmployeeServiceImpl() {
		
	}
	
	@Override
	public String addEmployee(Employee employee) {
			return employeeRepository.addEmployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		return employeeRepository.updateEmployee(id, employee);
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();	
	}

	@Override
	public String deleteEmployeeById(String id) {
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployee() {
		employeeRepository.deleteAllEmployee();

	}
}
