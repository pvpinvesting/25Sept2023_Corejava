package com.grats.collection;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hashtableObj=new Hashtable<>();
		hashtableObj.put(1001, "TCS");
		hashtableObj.put(456, "Wipro");
		hashtableObj.put(674, "HCL");
		hashtableObj.put(434, "Grats");
		hashtableObj.put(3443, "Accenture");
		hashtableObj.put(3454, "JKT");
		hashtableObj.put(null, null);
		hashtableObj.put(null, "asdfasd");
		hashtableObj.put(3635, null);
		String compName=hashtableObj.get(434);
		System.out.println(":compName:"+compName);
		System.out.println(":hashMapObj:"+hashtableObj);
		
		Set<Integer> keys=hashtableObj.keySet();
		System.out.println(":keys:"+keys);
		for(Integer key:keys) {
			System.out.println(":key:"+key+":value:"+hashtableObj.get(key));
		}
		
		System.out.println(":===========================================>:");
		Set<Entry<Integer,String>> entrySet=hashtableObj.entrySet();
		for(Entry<Integer,String> entry:entrySet) {
			System.out.println(":key:"+entry.getKey()+":value:"+entry.getValue());
		}
		
		
		
	}

}
