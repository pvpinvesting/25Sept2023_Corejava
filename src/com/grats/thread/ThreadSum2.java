package com.grats.thread;

public class ThreadSum2 extends Thread {
	public int sum=0;
	public void run() {
		System.out.println(":ThreadSum2:Start:");
		for(int i=101;i<=200;i++) {
			this.sum+=i;
		}
		System.out.println("Sum of 101 to 200 is: "+this.sum);
		System.out.println(":ThreadSum2:End:");
	}
}
