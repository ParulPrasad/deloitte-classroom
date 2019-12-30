package com.deloitte;

import java.util.Set;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> items2=new PriorityQueue<>();
		items2.add("aa");
		items2.add("ff");
		items2.add("cc");
		items2.add("zz");
		
		
		for(String item:items2) {
			System.out.println(item);
		}

	}

}
