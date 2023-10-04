package com.grats.methodoverriding;

public class Son extends Father {
	public String name="Venkatesh";
	public String assets=super.assets+":"+"100K INR";
	public String getAssets() {
		return assets;
	}
	public void sonDuties() {
		System.out.println("Studies & Games");
	}
}
