package com.grats.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementDemo2 {

	public static void main(String[] args)throws SQLException {
		System.out.println(":Start:");
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
//		String insertEmpDetl="INSERT INTO EMP_detl VALUES(1002,'Rajesh',95000.00,'22-AUG-23','Hyderabad',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
		String updateEmpDetl="update emp_detl set address='CHENNAI',MODIFIcATION_TIME=CURRENT_TIMESTAMP";
		Connection con=null;
		Statement st=null;
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			st=con.createStatement();
			System.out.println(":Statement object has created:con:"+st);
//			int noRowsInserted = st.executeUpdate(insertEmpDetl);
//			System.out.println(":sql has executed:noRowsInserted:"+noRowsInserted);
			int noRowsUpdated = st.executeUpdate(updateEmpDetl);
			System.out.println(":sql has executed:noRowsUpdated:"+noRowsUpdated);
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
