package com.grats.garbagecollection;

public class GCDemo1 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		GCDemo1 s1 = new GCDemo1();
		GCDemo1 s2 = new GCDemo1();
		
		s1.finalize();
		
		s1 = null;
		s2 = null;
//		System.gc();
		Runtime.getRuntime().gc();
	}

}
