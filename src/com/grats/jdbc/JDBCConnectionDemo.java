package com.grats.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(":Start:");
		
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
		String sql="SELECT ID,NAME,SALARY FROM EMP";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			st=con.createStatement();
			System.out.println(":Statement object has created:con:"+st);
			rs=st.executeQuery(sql);
			System.out.println(":sql has executed:"+rs);
			while(rs.next()) {
				int id=rs.getInt(1);
				int id1=rs.getInt("ID");
				String name=rs.getString(2);
				String name2=rs.getString("nAmE");
				double salary=rs.getDouble(3);
				double salary2=rs.getDouble("SALARY");
				System.out.println("id:"+id+":id1:"+id1);
				System.out.println("name:"+name+":name2:"+name2);
				System.out.println("salary:"+salary+":salary2:"+salary2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println(":finally block:");
			rs.close();
			st.close();
			con.close();
			System.out.println(":resources closed:");
		}
		
		System.out.println(":End:");

	}

}
