package com.moglix.employeemanagementsystem;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeServiceI;
import com.moglix.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		EmployeeServiceI employeeService = EmployeeServiceImpl.getInstance();
		
		
		employee.setEmpID("12345");
		employee.setEmpFirstName("akhilesh");
		employee.setEmpLastName("singh");
		employee.setAddress("knapur");
		employee.setPanCard("NWRPS4539F");
			
		
		//-----  add employee ------
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
		

		//-----  fetch employee detail ------
		Employee employee2 = employeeService.getEmployeeById("12345");

		if(employee2==null)
			System.out.println("Id dosn't exist");
		else {
			System.out.println("Id exist");
		}
		
		//-----  del employee by id  ------
		String s = employeeService.deleteEmployeeById("12345");
		System.out.println(s.toString());  
		
		Employee employee3 = employeeService.getEmployeeById("12345");
		
		if(employee3==null)
			System.out.println("Id dosn't exist");
		else {
			System.out.println("Id exist");
		}
		
	
		//-----  fetch all employees ------
//		Employee  employees[] = employeeService.getEmployees();
//		for(Employee employee3 : employees)
//		{
//			if(employee3!=null) {
//		
//			System.out.println(employee3.toString());
//			}
//		}
		
		//-----  del all employees  ------
		//employeeService.delAllEmployee();
		
		//----- update employees  ------
		String s1 = employeeService.updateEmployee("12345", employee);
		if(s1.equals("Done")) {
			System.out.println("Updated Successfully");
		}
		else
			System.out.println("Id doesn't exist");
		
	}
}
