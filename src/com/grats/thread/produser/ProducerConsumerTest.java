package com.grats.thread.produser;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common c1=new Common();
		ProducerThread pt=new ProducerThread(c1);
		ConsumerThread ct=new ConsumerThread(c1);
		pt.setPriority(9);
		pt.start();
		ct.start();
	}

}
