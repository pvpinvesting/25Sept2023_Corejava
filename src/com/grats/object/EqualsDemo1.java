package com.grats.object;

public class EqualsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1=new Student(1001,"Prakash P","Bangalore");
		Student std2=new Student(1001,"Prakash P","Bangalore");
		System.out.println(std1.equals(std2));
		
		Student std3=new Student(1001,"Prakash P","Bangalore");
		Student std4=new Student(1001,"Prakash P","Hyd");
		System.out.println(std3.equals(std4));
		
		

	}

}
