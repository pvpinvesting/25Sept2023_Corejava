package com.grats.thread;

public class ThreadF extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(":Start:ThreadF");
		for(int i=201;i<300;i++) {
			System.out.println(":i:"+i);
		}
		System.out.println(":End:ThreadF");

	}
}
