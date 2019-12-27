package com.deloitte;
import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b && a>c)
			System.out.println("a: "+a);
		else if( b>c)
			System.out.println("b: "+b);
		else if(c>b)
			System.out.println("c: "+c);
		else
			System.out.println("all are equal");
		
		
	}

}
