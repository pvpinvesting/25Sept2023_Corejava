package com.grats.thread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj=new ThreadDemo1();
//		obj.run();
		Thread obj1=new Thread(obj);
//		obj1.run();
		
		ThreadDemo2 obj2=new ThreadDemo2();
		
		
//		obj1.start();
//		obj2.start();
		obj1.run();
		obj2.run();
	}

}
