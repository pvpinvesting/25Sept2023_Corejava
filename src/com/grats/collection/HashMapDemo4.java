package com.grats.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Employee> empList=new A
		List<Employee> empList=new ArrayList<>();
		//db operations
		empList.add(new Employee(1001, "Lokesh", 5000, "001"));
		empList.add(new Employee(1002, "Mastan", 6000, "002"));
		empList.add(new Employee(1003, "Rajesh", 5000, "001"));
		empList.add(new Employee(1004, "Venki", 7000, "003"));
		empList.add(new Employee(1001, "Lokesh", 5000, "005"));
		empList.add(new Employee(1002, "Mastan", 6000, "006"));
		empList.add(new Employee(1003, "Rajesh", 5000, "001"));
		empList.add(new Employee(1004, "Venki", 7000, "002"));
		empList.add(new Employee(1001, "Lokesh", 5000, "003"));
		empList.add(new Employee(1002, "Mastan", 6000, "001"));
		empList.add(new Employee(1003, "Rajesh", 5000, "001"));
		empList.add(new Employee(1004, "Venki", 7000, "004"));
		
		Map<String,List<Employee>> compWiseEmp=new HashMap<>();
//		Map<String,Employee> compWiseEmp=new HashMap<>();
		for(Employee emp:empList) {
			
			if(compWiseEmp.containsKey(emp.getCompCode())){
				List<Employee> empList3=compWiseEmp.get(emp.getCompCode());
				empList3.add(emp);
			}else {
				List<Employee> empList2=new ArrayList<>();
				empList2.add(emp);
				compWiseEmp.put(emp.getCompCode(), empList2);
			}
			
		}
		System.out.println(":compWiseEmp:"+compWiseEmp);
	}

}
