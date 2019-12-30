package com.deloitte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		Set items=new HashSet();
		items.add("manish");
		items.add(25);
		items.add(25);
		items.add(25);
		items.add(true);
		items.add(20.6);
		
		for(Object item:items) {
			System.out.println(item);
		}
		items.remove(25);
		System.out.println("after removing");
		for(Object item:items) {
			System.out.println(item);
		}
		
		Set<Integer> items1=new HashSet();
		items1.add(23);
		items1.add(25);
		items1.add(22);
		items1.add(45);
		
		
		for(int item:items1) {
			System.out.println(item);
		}
		items1.remove(25);
		System.out.println("after removing");
		for(Object item:items1) {
			System.out.println(item);
		}
		Set<Integer> items2=new TreeSet();
		items2.add(23);
		items2.add(25);
		items2.add(22);
		items2.add(45);
		
		
		for(int item:items2) {
			System.out.println(item);
		}
	}

}
