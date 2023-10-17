package com.grats.thread;

public class B {
	
	A obj;
	String obj1;

	B( ){
		
	}
	
	B(A a){
		this.obj=a;
	}
	
	public void methodB() {
		obj.methodA(); 
		
		//:Inside class A:methodA()
//		String str="Hi";
//		str=str.concat(str);
//		B object=new B
		System.out.println(":Inside class B:methodB():");
	}
	
	
}
