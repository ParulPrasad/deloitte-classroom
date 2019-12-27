package com.deloitte;

import java.util.Scanner;

public class ControlStructureSwitch {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);

	}

}
