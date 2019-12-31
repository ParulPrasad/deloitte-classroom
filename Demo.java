package com.deloitte;
import java.util.*;


public class Demo {

	public static void main(String[] args) {
	List<Integer> items=Arrays.asList(2020,2016,2015,2012);
	items.stream().filter(i->(i%4==0)||(i%100==0 && i%400==0)).forEach(i->System.out.println(i));	

	}

}
