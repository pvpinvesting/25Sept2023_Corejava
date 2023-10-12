package com.grats.markerinterface;

public class SerializationTest {

	public static void main(String[] args) {
		ObjectSerialization obj = new ObjectSerialization();
		obj.createFolder();

		Employee emp = new Employee(1001, "ABC", "Bangalore","560017");
		Employee emp2 = new Employee(1002, "XYZ", "Bangalore","560018");
		
		obj.writeObject(emp,emp2);


	}

}
