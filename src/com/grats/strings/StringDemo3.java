package com.grats.strings;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("String:");
        String s = "Sachin";
        System.out.println(s.hashCode());
        s = s.concat(" Tendulkar");
        System.out.println(s.hashCode());

        System.out.println("StringBuffer:");
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append(" Tendulkar");
        System.out.println(stringBuffer.hashCode());

        System.out.println("StringBuilder:");
        StringBuilder stringBuilder = new StringBuilder("Sachin");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" Tendulkar");
        System.out.println(stringBuilder.hashCode());


	}

}
