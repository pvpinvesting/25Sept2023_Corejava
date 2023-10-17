package com.grats.thread;

public class ThreadC extends Thread {

	public void run() {
		System.out.println(":ThreadC:Start:");
		for(int k=201;k<=300;k++) {
			interrupt();
			System.out.println(":k:"+k);
		}
		System.out.println(":ThreadC:End:");
	}
}
