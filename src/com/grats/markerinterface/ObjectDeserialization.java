package com.grats.markerinterface;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserialization {

	private static final String FILE_PATH = "files/accounts";

	public Employee[] readObject() {
		FileInputStream fis;
		ObjectInputStream ois;
		Object obj;
		Employee[] employees = null;
		try {
			fis = new FileInputStream(FILE_PATH + "/" + "employee_master.obj");
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
			employees = (Employee[]) obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

}
