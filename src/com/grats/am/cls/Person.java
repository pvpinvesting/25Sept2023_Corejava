package com.grats.am.cls;

public class Person {

	public String fName="Prakash";
	public String lName="P";
	public String address="Bangalore";
	
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		System.out.println(person);
	}

}
