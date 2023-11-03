package com.grats.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class JDBCBatchProcessDemo {

	public static void main(String[] args)throws Exception {
		System.out.println(":Start:");
		String connectionStr="jdbc:oracle:thin:demouser/demouser@localhost:1521/XEPDB1";
		String username="demouser";
		String password="demouser";
		String insertEmpDetl="INSERT INTO EMP_detl VALUES(?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1003,"Venki","Hyderabad",100000));
		empList.add(new Employee(1004,"Ravi","Bangalore",75000));
		empList.add(new Employee(1005,"Seena","Mumbai",30000));
		empList.add(new Employee(1006,"Bobby","Hyderabad",50000));
		empList.add(new Employee(1007,"Hampi","Pune",80000));
		empList.add(new Employee(1008,"Kishore","Hyderabad",100000));
		empList.add(new Employee(1009,"Prakash","Chennai",200000));
		
		try {
			con=DriverManager.getConnection(connectionStr, username, password);
			System.out.println(":Database connection has created:con:"+con);
			ps=con.prepareStatement(insertEmpDetl);
			System.out.println(":Statement object has created:con:"+ps);
			int i=1;
			for(Employee emp:empList) {
				ps.setInt(i++, emp.getId());
				ps.setString(i++, emp.getName());
				ps.setDouble(i++, emp.getSalary());
				ps.setDate(i++, new Date(454665465));
				ps.setString(i++, emp.getAddress());
				ps.setTimestamp(i++, new Timestamp(454665465));
				ps.setTimestamp(i++, new Timestamp(454665465));
//				ps.execute();
				ps.addBatch();
				i=1;
			}
			int[] rowsArr=ps.executeBatch();
			for(int rowsupdated:rowsArr) {
				System.out.println(":rowsupdated:"+rowsupdated);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			System.out.println(":finally block:");
			ps.close();
			con.close();
			System.out.println(":resources closed:");
		}
		System.out.println(":End:");

	}

}
