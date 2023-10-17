package com.grats.thread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadD t1=new ThreadD();
		Runnable t2=new ThreadE();
		ThreadF t3=new ThreadF();
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		Thread helpObj=new Thread(t2);
		helpObj.start();
		t3.start();
		

	}

}
