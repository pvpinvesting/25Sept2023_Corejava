package com.grats.thread.produser;

public class ProducerThread extends Thread {

	Common c1;
	
	ProducerThread(Common c1){
		this.c1=c1;
	}
	
	public void run() {
		int x=0;
		while(true) {
			x=x+1;
			c1.produce(x);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
