package com.grats.strings;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer("Java ");
        sb.append("Technology"); // now original string is changed
        System.out.println(sb);
//        sb.append(false);
        sb.insert(2, " Hello ");
        System.out.println(sb);
        
        String str=sb.toString();
        System.out.println(str);
        
        
	}

}
