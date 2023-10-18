package com.grats.thread;

public class ThreadJoin1 extends Thread {

	int sum;
	
	public void run() {
		System.out.println(":ThreadJoin1:Start:");
		for(int i=1;i<=100;i++) {
			if(i==50||i==75) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sum+=i;
		}
		System.out.println(":Sum of 1 to 100:"+sum);
		System.out.println(":ThreadJoin1:End:");
	}
	
}
