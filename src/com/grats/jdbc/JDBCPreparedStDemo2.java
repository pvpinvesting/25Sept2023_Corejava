package com.grats.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStDemo2 {

	public static void main(String[] args)throws Exception {
		System.out.println(":Start:");
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
		String selectEmpDetl="SELECT id,name,salary,address FROM EMP_DETL where address=? AND salary=?";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			ps=con.prepareStatement(selectEmpDetl);
			System.out.println(":Statement object has created:con:"+ps);
			ps.setString(1, "Hyderabad");
			ps.setDouble(2, 100000.0);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt("ID");
				String name=rs.getString("nAmE");
				double salary=rs.getDouble("SALARY");
				String address=rs.getString("address");
				System.out.println(":"+id+":"+name+":"+salary+":"+address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			System.out.println(":finally block:");
			rs.close();
			ps.close();
			con.close();
			System.out.println(":resources closed:");
		}
		System.out.println(":End:");

	}

}
