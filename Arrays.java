package com.deloitte;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n;
		
		int[] nums= {1,2,10,8,6};
		int max=nums[0];
		int min=nums[0];
		for(int i:nums) {
			if(i>max)
				max=i;
			if(i<min)
				min=1;
		}

		System.out.println("largest is "+max);
		System.out.println("smallest is "+min);
		
	}

}
