package com.deloitte;

public class PolymorphismOverloading {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
	return a+b+c;
	}
	float add(float a,float b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		 PolymorphismOverloading obj=new  PolymorphismOverloading();
		float sum=obj.add(4.4f,3.0f);
		System.out.println(sum);
		int sum1=obj.add(4,3);
		System.out.println(sum1);
		int sum2=obj.add(4,6,3);
		System.out.println(sum2);
		
       
	}

}
