package com.grats.thread;

public class ThreadSum1 extends Thread {
	public int sum=0;
	public void run() {
		System.out.println(":ThreadSum1:Start:");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=100;i++) {
			this.sum+=i;
		}
		System.out.println("Sum of 1 to 100 is: "+this.sum);
		System.out.println(":ThreadSum1:End:");
	}
}
