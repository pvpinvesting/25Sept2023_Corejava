package com.grats.exceptions.exp;

public class InterruptedExeptionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":Start:");
		try {
			Thread.sleep(1000);
			System.out.println(":Current thread:"+Thread.currentThread());
			Thread.currentThread().interrupt();
		}catch(InterruptedException iex) {
			System.out.println(":InterruptedException:"+iex);
			iex.printStackTrace();
		}
		System.out.println(":End:");
	}

}
