package com.grats.arrays;

public class TwoWheeler implements Vehicle {

	public int noOfWheels;
	public String brand;
	public double speed;
	
	
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println(":noOfWheels:"+noOfWheels);

	}

	public void topSpeed() {
		// TODO Auto-generated method stub
		System.out.println(":speed:"+speed);
	}

	public void brand() {
		// TODO Auto-generated method stub
		System.out.println(":brand:"+brand);
	}

	public TwoWheeler(int noOfWheels, String brand, double speed) {
		super();
		this.noOfWheels = noOfWheels;
		this.brand = brand;
		this.speed = speed;
	}

}
