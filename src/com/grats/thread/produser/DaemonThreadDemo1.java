package com.grats.thread.produser;

public class DaemonThreadDemo1 extends Thread {
	
	public void run() {
		System.out.println(":DaemonThreadDemo1:Start:");
		for(int i=1;i<500;i++) {
			System.out.println(":i:"+i);
		}
		System.out.println(":DaemonThreadDemo1:End:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":main:Start:");
		DaemonThreadDemo1 t1=new DaemonThreadDemo1();
//		t1.setDaemon(true);
		t1.start();
		for(int k=1;k<50;k++) {
			System.out.println(":k:"+k);
		}
		System.out.println(":main:End:");
	}

}
