package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.Employee;

public class EmployeeDAO {
	
	private static int counter = 0;

	Employee employees[] = new Employee[10];
	
	public String addEmployee(Employee employee) {
		if(counter<employees.length) {
			employees[counter++] = employee;
			return "success";
		}
		else
			return "Array is full";
		
	}
	public Employee getEmployeeById(String id) {
		
		for(Employee employee : employees) {
			
			if(employee!=null && id.equals(employee.getEmpID())) {
				return employee;
			}
		}
		return null;
	}
	public Employee[] getEmployees() {
		return employees;	
	}
	
	private int getIndex(String id) {
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getEmpID().equals(id))
				return i;
		}
		return -1;
	}

	public String deleteEmployeById(String id) {
		int index = this.getIndex(id);
		
		if(index!=-1) {
			employees[index]=null;
			return "deleted success";
		}
		else 
			return "id not found";
	}
	
	public void delAllEmployee() {
		employees = null;
		System.out.println("All data deleted");
	}
	
	public String updateEployee(Employee employee, String id) {
     
		int index = this.getIndex(id);
		
		if(index!=-1) {
			employees[index]= employee;
			return "update success";
		}
		else 
			return "id not found";
	}
}