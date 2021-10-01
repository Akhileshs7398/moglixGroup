package com.moglix.employeemanagementsystem.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private static int counter = 0;

	private List<Employee> employees = new LinkedList<>();
	
	private static EmployeeRepository employeeRepository;
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository  = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		else
			return employeeRepository;
		
	}
	private EmployeeRepositoryImpl() {
		
	}
	@Override
	public String addEmployee(Employee employee) {
		boolean result = employees.add(employee);
		if(result)
			return "success";
		else
			return "Failed add employee";
		/*
		 * if(counter<employees.length) { employees[counter++] = employee; return
		 * "success"; } else return "Array is full";
		 */
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		//int index = this.getIndex(id);
		
		Employee employee2 = this.getEmployeeById(id);
		boolean b1 = employees.remove(employee2);
		boolean b2 = employees.add(employee);
		if(b1&b2)
			return "Done";
		else
			return "failed";
		
		/*
		 * if(index!=-1) { employees[index]= employee; return "update success"; } else
		 * return "id not found";
		 */
	}

	@Override
	public Employee getEmployeeById(String id) {
		for(Employee employee : employees) {
			if(id.equals(employee.getEmpID())) {
				return employee;
			}
		}
		return null;
		/*
		 * for(Employee employee : employees) {
		 * 
		 * if(employee!=null && id.equals(employee.get(i).getEmpID())) { return
		 * employee; } }
		 */
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;	
	}

	@Override
	public String deleteEmployeeById(String id) {
		
		Employee employee = this.getEmployeeById(id);
		if(employee!=null) {
			if(employees.remove(employee))	
				return "success delete";
			else
				return "fail";
		}
		else
			return "not found employee";
		/*
		 * int index = this.getIndex(id);
		 * if(index!=-1) { employees[index]=null; return "deleted success"; } else
		 * return "id not found";
		 */
	}

	@Override
	public void deleteAllEmployee() {
		employees.clear();
		System.out.println("All data deleted");
	}
	
	private int getIndex(String id) {
//		for(int i=0;i<employees.length;i++) {
//			if(employees[i].getEmpID().equals(id))
//				return i;
//		}
//		return -1;
		return 0;
	}

}
