package com.moglix.employeemanagementsystem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Employee;

public class Main3 {

	public static void main(String[] args) {
		
		TreeSet<Employee> employees = new TreeSet<>();
		
		Employee employee = new Employee("ar123","arjun","pandit",999999f);
		Employee employee2 = new Employee("kan123","pandit","Kanpur",888888f);
		Employee employee3 = new Employee("ak123","pandit","Kanpur",777777f);
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		//HashSet<Employee> emp = (HashSet<Employee>) employees.clone();
		//System.out.println(emp);
		
		
		boolean b = employees.contains(employee3);
 		System.out.println(b);
		System.out.println(employees);
	}

}
