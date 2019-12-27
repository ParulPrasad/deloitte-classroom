package com.deloitte;
import java.util.Scanner;

public class PatternLoop {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter n:");
		n=in.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=i;j>=1;j--) {
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			
			System.out.println("\n");
		}
       
	}

}
