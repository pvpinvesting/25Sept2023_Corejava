package com.grats.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementDemo {

	public static void main(String[] args)throws SQLException {
		System.out.println(":Start:");
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
		
		String createTable="CREATE TABLE EMP_DETL\r\n"
				+ "					(\r\n"
				+ "						 id 				number\r\n"
				+ "						,name 				varchar2(30)\r\n"
				+ "						,salary 			number(10,2)\r\n"
				+ "						,joining_date 		date\r\n"
				+ "						,address 			varchar2(50)\r\n"
				+ "						,creation_time 		timestamp\r\n"
				+ "						,modification_time 	timestamp\r\n"
				+ "					)";
		
		Connection con=null;
		Statement st=null;
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			st=con.createStatement();
			System.out.println(":Statement object has created:con:"+st);
			boolean flag=st.execute(createTable);
			System.out.println(":sql has executed:flag:"+flag);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			System.out.println(":finally block:");
			st.close();
			con.close();
			System.out.println(":resources closed:");
		}
		System.out.println(":End:");

	}

}
