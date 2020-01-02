package com.deloitte;
import java.sql.*;

public class EmployeeCrudOperation {

	public static void main(String[] args)throws SQLException {
		/*
		 * 
		 * create connection
		 * 
		 * 
		 * create statement
		 * 
		 * 
		 * execute query
		 * 
		 * 
		 * process resultset
		 * 
		 * 
		 */
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		
		if(con!=null) {
			System.out.println("connection done");
		}
		
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from employee");
		System.out.println("EmpId  EmpNames");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		}
	}

}
