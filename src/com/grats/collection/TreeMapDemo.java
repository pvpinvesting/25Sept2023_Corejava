package com.grats.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashMapObj=new HashMap<>();
		hashMapObj.put(434, "Grats");
		hashMapObj.put(674, "HCL");
		hashMapObj.put(532, "TCS");
		hashMapObj.put(456, "Wipro");
		hashMapObj.put(23, "Accenture");
		hashMapObj.put(3454, "JKT");
		
		System.out.println(":hashMapObj:"+hashMapObj);
		
		TreeMap<Integer,String> treeMapObj=new TreeMap<>();
		treeMapObj.put(434, "Grats");
		treeMapObj.put(674, "HCL");
		treeMapObj.put(532, "TCS");
		treeMapObj.put(456, "Wipro");
		treeMapObj.put(23, "Accenture");
		treeMapObj.put(3454, "JKT");
		treeMapObj.put(5656, null);
//		treeMapObj.put(null, "asdf");
		System.out.println(":treeMapObj:"+treeMapObj);
	}

}
