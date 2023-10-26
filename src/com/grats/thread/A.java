package com.grats.thread;

public class A {

	public void methodA() {
		System.out.println(":Inside class A:methodA()");
	}

	public void funA(String string) {
		// TODO Auto-generated method stub
		System.out.println(":Inside class A:funA()");
	}

	public int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			sum+=i;
		}
		return sum;
	}
	
}
