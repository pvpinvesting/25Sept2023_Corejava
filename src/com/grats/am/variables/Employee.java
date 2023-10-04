package com.grats.am.variables;

public class Employee {

	public int id=1001;
	protected String name="Sachin";
	String profession="Cricket";
	private String city="Mumbai";
	
	public void printEmployee() {
		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
		id=1002;
		name="Shehwag";
		profession="Cricket";
		city="Delhi";
		System.out.println(":id:"+id+":name:"+name+":profession:"+profession+":city:"+city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.printEmployee();
	}

}
