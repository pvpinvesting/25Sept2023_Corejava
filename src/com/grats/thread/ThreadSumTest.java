package com.grats.thread;

public class ThreadSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSum1 t1=new ThreadSum1();
		ThreadSum2 t2=new ThreadSum2();
		ThreadSum3 t3=new ThreadSum3(t1,t2);
		t1.start();
		t1.suspend(); // suspended the thread temporarily
		t2.start();
		t3.start();
		
	}

}
