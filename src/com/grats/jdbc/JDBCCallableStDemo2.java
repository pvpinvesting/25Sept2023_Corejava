package com.grats.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCCallableStDemo2 {

	public static void main(String[] args)throws SQLException {
		System.out.println(":Start:");
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
		Connection con=null;
		CallableStatement cs=null;
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			cs = con.prepareCall("{?=call fetch_all_emp_sal(?)}");
			cs.registerOutParameter(1, Types.DOUBLE);
			cs.setInt(2, 1001);
			cs.execute();
			Double sumSal=cs.getDouble(1);
			System.out.println(":sumSal:"+sumSal);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			System.out.println(":finally block:");
			cs.close();
			con.close();
			System.out.println(":resources closed:");
		}
		System.out.println(":End:");

	}

}
