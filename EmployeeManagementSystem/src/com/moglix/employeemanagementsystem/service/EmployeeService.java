package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {
	
	EmployeeDAO  employeeDAO = new EmployeeDAO();
		
	public String addEmployee(Employee employee)
	{
		return employeeDAO.addEmployee(employee);
	}	
	
	public Employee getEmployeeById(String id) {
		return employeeDAO.getEmployeeById(id);
	}
	public Employee[] getEmployees() {
		return employeeDAO.getEmployees();
	}

	public void delAllEmployee() {
		employeeDAO.delAllEmployee();
	}
	public String deleteEmployeById(String empId) {
		return employeeDAO.deleteEmployeById(empId);
	}
	public String updateEployee(Employee employee, String id){
		return employeeDAO.updateEployee(employee, id);
	}
	
} 