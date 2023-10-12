package com.grats.markerinterface;

public class SerializationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1001,"Prkaash","Hyd","598343");
		emp1.setAddress("Bangalore");
		System.out.println(emp1);
		
		ObjectSerialization obj=new ObjectSerialization();
		obj.createFolder();
		obj.writeObject(emp1);
	}

}
