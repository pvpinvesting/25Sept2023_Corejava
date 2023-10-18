package com.grats.thread;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		Thread1 t1=new Thread1(a1);
		Thread2 t2=new Thread2(a1);
		Thread3 t3=new Thread3(a1);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
