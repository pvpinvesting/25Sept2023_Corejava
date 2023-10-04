package com.grats.methodoverriding;

public class B extends A {
	public String getAssets(Son obj,int age){
		System.out.println("Inside A:"+obj.getAssets());
		return obj.getAssets();
	}
}
