package com.grats.thread;

public class Aa {
//	volatile int sum=0;
	int sum=0;
	public synchronized void funA(String s) {
		System.out.print("[ hello ["+s);
//		try {
////			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("] world ]");
	}
	
	public synchronized int calculateSum(int num) {
		sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
			if(i==50||i==150||i==250) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return sum;
	}
	
}
