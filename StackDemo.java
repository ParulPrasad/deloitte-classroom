package com.deloitte;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> items2=new Stack<>();
		items2.push("aa");
		items2.push("ff");
		items2.push("cc");
		items2.push("zz");
		
		
		while(!items2.isEmpty()) {
			System.out.println(items2.pop());
		}


	}

}
