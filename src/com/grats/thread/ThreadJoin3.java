package com.grats.thread;

public class ThreadJoin3 extends Thread {

	int sum;
	ThreadJoin1 t1;
	ThreadJoin2 t2;
	
	ThreadJoin3(ThreadJoin1 t1,ThreadJoin2 t2){
		this.t1=t1;
		this.t2=t2;
	}
	
	public void run() {
		System.out.println(":ThreadJoin3:Start:");
		for(int i=201;i<=300;i++) {
			sum+=i;
		}
		System.out.println(":Sum of 201 to 300:"+sum);
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//need sum of 1 to 300
		int sumOf1To300 = this.sum+this.t1.sum+this.t2.sum;
		System.out.println(":sumOf1To300:"+sumOf1To300);
		System.out.println(":ThreadJoin3:End:");
	}
}
