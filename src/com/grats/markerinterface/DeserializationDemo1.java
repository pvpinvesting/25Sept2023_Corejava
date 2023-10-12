package com.grats.markerinterface;

public class DeserializationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDeserialization obj=new ObjectDeserialization();
		
		for(Employee emp:obj.readObject()) {
			System.out.println(emp);
		}
	}

}
