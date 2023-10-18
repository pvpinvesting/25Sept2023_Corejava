package com.grats.thread;

public class ThreadSum3 extends Thread {
	public int sum=0;
	public ThreadSum1 threadSum1;
	public ThreadSum2 threadSum2;
	ThreadSum3(){
		
	}
	
	
	
	ThreadSum3(ThreadSum1 threadSum1,ThreadSum2 threadSum2){
		this.threadSum1=threadSum1;
		this.threadSum2=threadSum2;
	}
	
	public int sumOf1To300() {
		return this.threadSum1.sum+this.threadSum2.sum+this.sum;
	}
	
	public void run() {
		
		System.out.println(":ThreadSum3:Start:");
		//This thread should calculate sum 1 to 300
		try {
			this.threadSum1.resume();
			this.threadSum1.join();
			this.threadSum2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=201;i<=300;i++) {
			
			this.sum+=i;
		}
		
		System.out.println("Sum of 201 to 300 is: "+this.sum);
		int sum1To300=sumOf1To300();
		System.out.println(":sum1To300:"+sum1To300);
		System.out.println(":ThreadSum3:End:");
	}
}
