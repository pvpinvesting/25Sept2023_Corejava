package com.grats.gc;


public class GarbageCollectionDemo1 {
	
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("GarbageCollectionDemo1 finalize() called:");
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Integer num1=100;
		emp1=null;
		num1=null;
		System.out.println("Before calling gc");
		System.gc();
		System.out.println("Ater calling gc");
		
		GarbageCollectionDemo1 obj=new GarbageCollectionDemo1();
		obj = null;
		Runtime.getRuntime().gc();
		
		
	}

}
