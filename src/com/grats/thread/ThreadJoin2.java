package com.grats.thread;

public class ThreadJoin2 extends Thread {

	int sum;
	
	public void run() {
		System.out.println(":ThreadJoin2:Start:");
		for(int i=101;i<=200;i++) {
			if(i==150||i==175) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			sum+=i;
		}
		System.out.println(":Sum of 101 to 200:"+sum);
		System.out.println(":ThreadJoin2:End:");
	}
	
}
