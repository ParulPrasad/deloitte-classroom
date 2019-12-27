package com.deloitte;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
	  int []nums= {2,17,33,4,78};
	  System.out.print("Prime Numbers are:");
	  for(int i:nums) {
		  int count=0;
		  for(int j=1;j<=i;j++) {
			  if(i%j==0)
				  count++;
		  }
		  if(count==2)
			  System.out.print(i+"  ");
			  
	  }
	  

	}

}
