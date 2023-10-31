package com.grats.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vectorObj=new Vector<>();
		System.out.println(":capacity:"+vectorObj.capacity());
		vectorObj.add("Grates IT Services");
		vectorObj.add("HCL");
		vectorObj.add("Infosys");
		vectorObj.add("Wipro");
		vectorObj.add("Infosys");
		
		System.out.println(":vectorObj:"+vectorObj);
		
		for(String str:vectorObj) {
			System.out.println(":str:"+str);
		}
		
		System.out.println(":element at3:"+vectorObj.get(3));
		vectorObj.add("Grates IT Services");
		vectorObj.add("HCL");
		vectorObj.add("Infosys");
		vectorObj.add("Wipro");
		vectorObj.add("Infosys");
		vectorObj.add("Infosys");
		System.out.println(":capacity:"+vectorObj.capacity());
		System.out.println(":size:"+vectorObj.size());
		
		vectorObj.add(3,"TCS");
		System.out.println(":vectorObj:"+vectorObj);
//		vectorObj.clear();
		System.out.println(":vectorObj:"+vectorObj);
		
		Enumeration enumObj=vectorObj.elements();
		while(enumObj.hasMoreElements()) {
//			enumObj.nextElement();
			System.out.println(":ele:"+enumObj.nextElement());
		}
	}

}
