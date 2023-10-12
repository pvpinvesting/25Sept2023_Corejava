package com.grats.staticimport;

//import static com.grats.markerinterface.Employee.*;

import java.util.Date;
import java.sql.*;

public class StaticImportDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(COMPANY_NAME);
		java.util.Date today=new java.util.Date();
		System.out.println(today);
		
		java.sql.Date today2=new java.sql.Date(0);
		System.out.println(today2);
	}

}
