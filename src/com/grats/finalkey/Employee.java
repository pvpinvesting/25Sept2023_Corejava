package com.grats.finalkey;

public class Employee {
	
	String name="Prakash";
	final String compName;
	
	Employee(){
		System.out.println("Inside Employee Contructor");
	}
	
	{
		compName="Grats";
		System.out.println("Inside Employee Instance Block");
	}
	
	public final void printEmployee() {
		System.out.println("Inside printEMployee");
	}
	
	public void displayEmp() {
		System.out.println("Inside displayEmp");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
//		emp.compName="Wipro";
		Employee emp2=new Employee();
		emp.printEmployee();

	}

}
