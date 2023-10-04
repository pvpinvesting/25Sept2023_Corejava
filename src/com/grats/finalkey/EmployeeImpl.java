package com.grats.finalkey;

public class EmployeeImpl extends Employee {

	public void displayEmp() {
		// TODO Auto-generated method stub
		System.out.println("Inside EmployeeImpl");
	}
	
	public static void main(String[] args) {
		Employee obj=new EmployeeImpl();
		obj.printEmployee();
	}
}
