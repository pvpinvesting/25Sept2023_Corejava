package com.grats.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSetObj=new LinkedHashSet<>();
		linkedHashSetObj.add("Grates IT Services");
		linkedHashSetObj.add("HCL");
		linkedHashSetObj.add("Infosys");
		linkedHashSetObj.add("Wipro");
		System.out.println(":hashSetObj:"+linkedHashSetObj);
		boolean flag=linkedHashSetObj.add("Infosys");
		System.out.println(":flag:"+flag);
		boolean flag1=linkedHashSetObj.add("TCS");
		System.out.println(":flag1:"+flag1);
		linkedHashSetObj.add(null);
		linkedHashSetObj.add(null);
		System.out.println(":hashSetObj:"+linkedHashSetObj);
	}

}
