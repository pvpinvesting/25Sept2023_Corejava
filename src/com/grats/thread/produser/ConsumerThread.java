package com.grats.thread.produser;

public class ConsumerThread extends Thread {
	Common c1;
	ConsumerThread(Common c1){
		this.c1=c1;
	}
	
	public void run() {
		while(true) {
			int x=c1.consume();
			if(x!=0)
				System.out.println(":Consumer consumes:"+x);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
