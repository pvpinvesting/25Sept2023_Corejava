package com.grats.innerclass;

public class EmployeeImpl extends Employee {
//	public void printEmployee() {
//		System.out.println(empName+"-"+empId);
//	}
	public static void main(String[] args) {
		Employee emp = new EmployeeImpl(){
				public void printEmployee() {
					System.out.println(empName+"-"+empId);
				}
		};
		emp.printEmployee();
		
		AbstractDemo obj=new AbstractDemo() {
			public void functionAbstract() {
				System.out.println("Inside functionAbstract():");
			};
		};
		obj.functionAbstract();
	}
}
