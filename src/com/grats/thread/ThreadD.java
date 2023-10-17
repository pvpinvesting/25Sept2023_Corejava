package com.grats.thread;

public class ThreadD extends Thread {

	public void run() {
		System.out.println(":Start:ThreadD");
		for(int i=0;i<100;i++) {
			System.out.println(":i:"+i);
		}
		System.out.println(":End:ThreadD");
	}
	
}
