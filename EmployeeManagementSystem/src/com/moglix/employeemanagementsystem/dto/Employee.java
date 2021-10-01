package com.moglix.employeemanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee implements Comparable<Employee>{
	
	
	public Employee() { System.out.println("inside Employee class"); }
	 	
	public Employee(String empID, String empFirstName, String empLastName, float empSalary) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
	}
	
	public float calculate() {
		empSalary = this.getEmpSalary();
		float basic = (float) (0.1*empSalary);
		float ha = (float) (0.1*empSalary);
		float extra = (float) (0.1*empSalary);
		return basic+ha+extra;
	}
	
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	
	private String empID;
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	private String address;
	private String panCard;
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + ", address=" + address + ", panCard=" + panCard + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empID.compareTo(o.empID);
	}
}
