package com.grats.thread;

public class ThreadDemo2 extends Thread {

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(5000);
//			System.out.println("Inside run():ThreadDemo2:");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 obj=new ThreadDemo2();
		obj.start();
	}

}
