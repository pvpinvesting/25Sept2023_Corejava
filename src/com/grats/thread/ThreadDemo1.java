package com.grats.thread;

public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			
			System.out.println("Inside run():ThreadDemo1:");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj=new ThreadDemo1();
//		obj.run();
		Thread obj1=new Thread(obj);
//		obj1.run();
		obj1.start();

	}

}
