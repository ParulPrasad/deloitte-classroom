package com.deloitte;
import java.util.Scanner;

public class JavaAssignWeek1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=in.nextInt();
		int sum=0;
		int m;
		while(num>0) {
			m=num%10;
			if(m%2!=0)
			{
				sum=sum+m;
			}
			num=num/10;
		}
		System.out.println("sum of odd digits is:"+sum);

	}

}
