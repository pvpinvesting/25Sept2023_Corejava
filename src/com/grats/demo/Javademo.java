package com.grats.demo;

public class Javademo {

	static boolean foo(char c) 
    {
		 System.out.print("Inside foo"); 
        System.out.print(c); 
        return true; 
    } 
	
	static boolean print(char c) 
    {
		 System.out.print("Inside print"); 
        System.out.print(c); 
        return true; 
    } 
	
    public static void main( String[] argv ) 
    {
//        int i = 0; 
//        for (foo('A'); foo('B') && (i < 2); foo('C')) 
//        {
//            i++; //1 2 
//            foo('D'); 
//        } 
    	foo('A');
    	print('B');
    	//
    	//
    	
    } 
    
    //ABDCBDCB

}
