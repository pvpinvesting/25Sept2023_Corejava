package com.grats.thread;

public class ThreadB extends Thread {
	
	public void run() {
		System.out.println(":ThreadB:Start:");
		for(int j=101;j<=200;j++) {
			interrupt();
			System.out.println(":j:"+j);
		}
		System.out.println(":ThreadB:End:");
	}

}
