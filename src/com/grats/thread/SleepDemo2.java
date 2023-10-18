package com.grats.thread;

public class SleepDemo2 extends Thread {

	public void run() {
		System.out.println(":SleepDemo2:Start:");
		for(int i=0;i<=300;i++) {
			
			if(i==100||i==200||i==300) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(":i:"+i);
		}
		System.out.println(":SleepDemo2:End:");
	}
	
}
