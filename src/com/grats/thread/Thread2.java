package com.grats.thread;

public class Thread2 extends Thread {
	A a1;
	
	Thread2(){
		
	}
	
	Thread2(A a1){
			this.a1=a1;
	}
	
	public void run() {
		a1.funA(".Net");
		int sumOf200=a1.calculateSum(200);
		System.out.println(":sumOf200:"+sumOf200);
	}
}
