package com.grats.am.variables.exp;

import com.grats.am.variables.Employee;

public class OutsidePackage {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(":id:"+emp.id+":name:");
//		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession+":city:"+emp.city);
		emp.id=1002;
//		emp.name="Shehwag";
//		emp.profession="Cricket";
//		emp.city="Delhi";
		System.out.println(":id:"+emp.id);
//		System.out.println(":id:"+emp.id+":name:"+emp.name+":profession:"+emp.profession+":city:"+emp.city);
		
		
	}

}
