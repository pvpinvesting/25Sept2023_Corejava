package com.grats.am.variables.exp;

import com.grats.am.variables.Employee;

public class EmployeeImplOutsidePackage extends Employee {

	public void displayEmployee() {
		System.out.println(":id:"+id+":name:"+name);
//		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
		id=1002;
		name="Shehwag";
//		profession="Cricket";
//		city="Delhi";
		System.out.println(":id:"+id+":name:"+name);
//		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImplOutsidePackage emp=new EmployeeImplOutsidePackage();
		emp.displayEmployee();
	}

}
