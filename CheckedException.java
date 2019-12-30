package com.deloitte;
import java.io.*;

public class CheckedException {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		try {
		System.out.println("enter values:");
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
			double x=a/b;
			System.out.println("res="+x);
		}
		catch(IOException e) {
			System.out.println("IOException occured."+e.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println("b shouldn't be 0. "+ex.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("i/p should be integers only. "+e.getMessage());
		}
		finally {System.out.println("done");}
		

	}

}
