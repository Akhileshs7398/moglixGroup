package com.moglix.employeemanagementsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Employee;

public class Main4 {

	public static void main(String[] args) {
		
//		String s = "akhil";
//		String s2 = "aman";
//		String s3 = "Pandit";
//		String s4 = "Aadi";
//		
//		TreeSet<String> set = new TreeSet<>();
//		set.add(s);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
//		
//		System.out.println(set);
		
		LinkedHashMap<String, String> hashMap = new LinkedHashMap();
		hashMap.put("ab1", "akhil");
		hashMap.put(null, "arjun");
		hashMap.put("ab3", "akhil");
		
		System.out.println(hashMap);
		
	}
}
