package com.grats.thread;

public class ThreadA extends Thread {

	public void run() {
		System.out.println(":ThreadA:Start:");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=100;i++) {
			System.out.println(":i:"+i);
		}
		System.out.println(":ThreadA:End:");
	}
	
}
