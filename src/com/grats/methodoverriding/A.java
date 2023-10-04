package com.grats.methodoverriding;

public class A {

	public String getAssets(Father obj,int age){
		System.out.println("Inside A:"+obj.getAssets());
		return obj.getAssets();
	}
	
}
