package com.deloitte;

import java.util.Scanner;

public class ControlStructureSwitch {

	public static void main(String[] args) {
		int option;
		float amount;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Option : 1-> INR->USD  2-> USD->INR");
		option=in.nextInt();
		
		switch(option){
		case 1:{
			System.out.println("Enter the amount(Rs) :");
			amount=in.nextFloat();
			System.out.println("Total = "+amount/71);
			break;
		}
		case 2:{
			System.out.println("Enter the amount($) :");
			amount=in.nextFloat();
			System.out.println("Total = "+amount*71);
			break;
		}
		default:{
	          System.out.println("Invalid Choice");
	  		  break;
	  		}
		
		}
		
		 
		

}
}
