package com.grats.methodoverriding;

public class Father extends GrandFather {
	public String name="Naresh";
	public String assets=super.assets+":"+"2 Cars";
	
	public String getAssets() {
		return assets;
	}
	
	public void fatherDuties() {
		System.out.println("Job, Responsibilities");
	}
}
