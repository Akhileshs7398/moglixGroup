package com.moglix.employeemanagementsystem.dto;

public class Manager extends Employee{
	
	private String projectname;
	private float projectAllowance;
	
	
	public Manager() {
		super("123","arjun","singh",123); //PC from base constructor
		System.out.println("Inside in manager");
	}
	
	
	public Manager(String empID, String empFirstName, String empLastName, float empSalary,
			String projectName, float projectAllowance) {
		super(empID, empFirstName, empLastName, empSalary);
		
		this.projectname = projectName;
		this.projectAllowance = this.projectAllowance;
		
		System.out.println("From paramitized manager");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nManager [projectname=" + projectname + ", projectAllowance=" + projectAllowance + "]";
	}

	@Override
	public float calculate() {
		// TODO Auto-generated method stub
		return super.calculate() + this.projectAllowance;
	}

	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public float getProjectAllowance() {
		return projectAllowance;
	}
	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
}
