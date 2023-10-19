package com.grats.thread.produser;

public class Common {
	int qty;
	volatile boolean isProducing=true;
	
	synchronized public void produce(int i) {
		if(isProducing) { // if flag is true pruducer thread has to produce a new value.
			qty=i;
			System.out.println("Producer produces:"+qty);
			isProducing=false;
			notify();
		}
//		try {
			System.out.println(":Producer is going to be wait:");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}catch(Exception e) {
//			System.out.println(":Exception:"+e);
//		}
	}
	
	public synchronized int consume() {
//		if(!flag) { //if flag is not true then consumer thread has to consumes the value which producer thread has produced.
//			flag=true; 
//			notify(); 
//			try {
//				System.out.println(":Consumer is going to be wait:");
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		if(isProducing) {
			try {
				System.out.println(":Consumer is going to be wait:");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}else {
			isProducing=true; 
			notify(); 
		}
		
		return qty;
	}
}
