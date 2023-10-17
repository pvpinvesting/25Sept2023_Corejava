package com.grats.thread;

public class ThreadE implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(":Start:ThreadE");
		for(int i=101;i<200;i++) {
			System.out.println(":i:"+i);
		}
		System.out.println(":End:ThreadE");

	}

}
