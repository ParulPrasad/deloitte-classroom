package com.deloitte;
import java.sql.*;
import java.util.*;

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
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		
		if(con!=null) {
			System.out.println("connection done");
		}
		
		Statement smt=con.createStatement();
		 
		 ResultSet rs=smt.executeQuery("insert into employee values("+sc.nextInt()+",'"+sc.next()+"','"+sc.next()+"','"+sc.next()+"',"+sc.nextInt()+","+sc.nextInt()+","+sc.nextInt()+","+sc.nextInt()+")");
		 rs=smt.executeQuery("select * from employee");
		 System.out.println("EmpId  EmpNames");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		}
		con.close();
		
	}

}
