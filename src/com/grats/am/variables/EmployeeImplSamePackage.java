package com.grats.am.variables;

public class EmployeeImplSamePackage extends Employee {

	public void displayEmployee() {
		System.out.println(":id:"+id+":name:"+name+":profession:"+profession);
//		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
		id=1002;
		name="Shehwag";
		profession="Cricket";
//		city="Delhi";
		System.out.println(":id:"+id+":name:"+name+":profession:"+profession);
//		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImplSamePackage emp=new EmployeeImplSamePackage();
		emp.displayEmployee();
	}

}
