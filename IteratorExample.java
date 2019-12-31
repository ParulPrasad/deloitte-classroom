package com.deloitte;

import java.util.*;
import java.util.stream.Collectors;

public class IteratorExample {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(5,2,1,3,10);
		int sum=0;
		for(int num:nums) {
			if(num%2!=0) {
				sum=sum+(num*num);
			}
			
		}
		System.out.println("sum :"+sum);
		
	    sum=nums.stream().filter((i)->i%2!=0).mapToInt((i)->i*i).sum();
	    System.out.println("sum :"+sum);
	    
	    sum=nums.stream().filter((i)->i%2!=0).map((i)->i*i).reduce(0,(s,c)->s+c);
	    System.out.println("sum :"+sum);
	    
	   List<Integer> oddsq=nums.stream().filter((i)->i%2!=0).map((i)->i*i).collect(Collectors.toList());
	   Collections.sort(oddsq);
	   System.out.println("list of sq :"+oddsq);
	}

}
