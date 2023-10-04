package com.grats.am.interview;

public class Singleton {
	private static Singleton obj=new Singleton(); 
	public static Singleton getInstance() {
		return obj;
	}
	public void printMessage() {
		System.out.println(":Inside Singleton Class:");
	}
}
