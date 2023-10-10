package com.grats.arrays;

public class FourWheeler implements Vehicle {
	
	public int noOfWheels;
	public String brand;
	public double speed;

	@Override
	public void noOfWheels() {
		// TODO Auto-generated method stub
		System.out.println(":noOfWheels:"+noOfWheels);
	}

	@Override
	public void topSpeed() {
		// TODO Auto-generated method stub
		System.out.println(":speed:"+speed);
	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println(":brand:"+brand);
	}

	public FourWheeler(int noOfWheels, String brand, double speed) {
		super();
		this.noOfWheels = noOfWheels;
		this.brand = brand;
		this.speed = speed;
	}

}
