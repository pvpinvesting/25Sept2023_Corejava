package com.grats.thread;

public class SleepDemo1 extends Thread{

	public void run() {
		System.out.println(":SleepDemo1:Start:");
		for(int i=0;i<500;i++) {
			System.out.println(":i:"+i);
			if(i==100||i==200||i==300||i==400||i==500) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		System.out.println(":SleepDemo1:End:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepDemo1 t1=new SleepDemo1();
		t1.start();
//		t1.interrupt();

	}

}
