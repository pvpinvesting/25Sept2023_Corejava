package com.grats.markerinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
	
	private static final String FILE_PATH="files/accounts";
	
	public void createFolder() {
		File file = new File(FILE_PATH);
		if(!file.exists()) {
			file.mkdirs();
		}
		System.out.println("directories are created");
	}
	
	public void deleteFolder() {
		File file = new File(FILE_PATH);
		file.delete();
	}
	
	public void writeObject(Employee... empArgs) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream(FILE_PATH+"/"+"employee_master.obj",true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(empArgs);
			System.out.println("Object written to file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
