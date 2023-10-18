package com.grats.thread;

import java.util.concurrent.SynchronousQueue;

public class Thread3 extends Thread {
	A a1;
	
	Thread3(){
		
	}
	
	Thread3(A a1){
			this.a1=a1;
	}
	
	public void run() {
		a1.funA("Python");
		int sumOf300=a1.calculateSum(300);
		System.out.println(":sumOf300:"+sumOf300);
	}
}
