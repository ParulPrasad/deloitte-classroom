package com.deloitte;
import java.sql.*;
import java.util.*;

public class StudDb {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
//		Statement smt=con.createStatement();
//		ResultSet rs=smt.executeQuery("Select * from employee where job='SALESMAN'");
//		 System.out.println("EmpId  EmpNames");
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"   "+rs.getString(2));
//			}
//		System.out.println("enter data:");
//	
//		int r=smt.executeUpdate("insert into dept values("+sc.nextInt()+",'"+sc.next()+"','"+sc.next()+"')");
//	    if(r>0) {
//	    	System.out.println("data inserted");
//	    }
//	  System.out.println("enter data:");
//	  int deptno=sc.nextInt();
//	  String depname=sc.next();
//	  String loc=sc.next();
//	  PreparedStatement ps=con.prepareStatement("insert into dept values(?,?,?)");
//	  ps.setInt(1, deptno);
//	  ps.setString(2, depname);
//	  ps.setString(3, loc);
//	  int r=ps.executeUpdate();
//	  if(r>0)
//		  System.out.println(r+"data inserted");
	  
	  System.out.println("enter data:");
	  int deptno=sc.nextInt();
	  String depname=sc.next();
	  PreparedStatement ps=con.prepareStatement("update dept set dname=? where deptno=?");
	  ps.setString(1, depname);
	  ps.setInt(2, deptno);
	  int r=ps.executeUpdate();
	  if(r>0)
	  System.out.println(r+" data updated");

	  System.out.println("enter deptno:");
	  deptno=sc.nextInt();
	  ps=con.prepareStatement("delete from dept where deptno=?");
	  ps.setInt(1, deptno);
	  r=ps.executeUpdate();
	  if(r>0)
		  System.out.println(r+" data deleted"); 
	  
	}
	
	
}
