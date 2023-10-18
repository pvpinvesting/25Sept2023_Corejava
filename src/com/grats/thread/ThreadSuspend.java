package com.grats.thread;

public class ThreadSuspend extends Thread {

	public void run() {
		System.out.println(":ThreadSuspend:Start:");
		for(int i=0;i<=100;i++) {
			if(i==50) {
				suspend();
			}
			System.out.println(":i:"+i);
		}
		resume();
		System.out.println(":ThreadSuspend:End:");
	}
	
}
