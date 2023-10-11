package com.grats.object;

public class CloneDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student std1=new Student(1001,"Prakash P","Bangalore");
		Student std2=std1; //Shallow copy
//		System.out.println("std1:"+std1);
//		System.out.println("std1:"+std2);
//		std2.setName("Rakesh");
//		System.out.println("std1:"+std1);
//		System.out.println("std1:"+std2);
		
		Student std3=new Student();
		std3.setId(std1.getId());
		std3.setName(std1.getName());
		std3.setAddress(std1.getAddress());
		std3.setAddress("Hyd");
		
//		System.out.println("std1:"+std1);
//		System.out.println("std3:"+std3);
		
		Student std4 = (Student)std1.clone();
		
		System.out.println("std1:"+std1);
		System.out.println("std4:"+std4);
		System.out.println("=============================");
		std4.setName("Rajesh");
		System.out.println("std1:"+std1);
		System.out.println("std4:"+std4);
		
	}

}
