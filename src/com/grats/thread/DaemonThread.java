package com.grats.thread;

public class DaemonThread extends Thread {
	
	public void run() {
		System.out.println(":DaemonThread:Start:");
		for(int i=1;i<500;i++) {
			System.out.println("i:"+i);
		}
		System.out.println(":DaemonThread:End:");
	}

	public static void main(String[] args) {
		System.out.println(":main:Start:");
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		for(int k=5;k<50;k++) {
			System.out.println("k:"+k);
		}
		System.out.println(":main:End:");
	}

}
