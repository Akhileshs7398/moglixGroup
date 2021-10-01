package com.moglix.employeemanagementsystem;

import com.moglix.employeemanagementsystem.dto.Manager;

public class Main2 {
	
	public final int a;

	public Main2() {
	// TODO Auto-generated constructor stub
		this.a=2;
	}
	public static void main(String[] args) {
		
		Manager manger = new Manager("123","janam","singh",100000,"ABC",10000);  
		//System.out.println(manger.toString());
		System.out.println(manger.calculate());
	}

}
