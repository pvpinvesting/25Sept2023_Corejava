package com.grats.object;

public class FinalizeDemo1 {
	
	public void finalize() {
		System.out.println(":finalize() called:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeDemo1 obj = new FinalizeDemo1();
		System.out.println(":obj:"+obj);
		System.gc();
		
	}

}
