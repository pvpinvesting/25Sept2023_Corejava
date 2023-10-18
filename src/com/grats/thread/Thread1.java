package com.grats.thread;

public class Thread1 extends Thread {
	
	A a1;
	
	Thread1(){
		
	}
	
	Thread1(A a1){
			this.a1=a1;
	}
	
	public void run() {
		a1.funA("Java");
		int sumOf100=a1.calculateSum(100);
		System.out.println(":sumOf100:"+sumOf100);
	}
}
