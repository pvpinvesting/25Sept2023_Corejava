package com.grats.object;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student(1001,"Prakash P","Bangalore");
		Student std2=new Student(1001,"Prakash P","Bangalore");
		System.out.println(std1.equals(std2));
		
		System.out.println(":std1.hashCode():"+std1.hashCode());
		System.out.println(":std2.hashCode():"+std2.hashCode());

	}

}
