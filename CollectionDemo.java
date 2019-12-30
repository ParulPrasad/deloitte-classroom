package com.deloitte;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;



public class CollectionDemo {

	public static void main(String[] args) {
		Collection items=new ArrayList();
		items.add("manish");
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
		
		List items1=new ArrayList();
		items1.add("manish");
		items1.add(25);
		items1.add(true);
		items1.add(20.6);
		items1.add(2, "raj");
		
		for(Object item:items1) {
			System.out.println(item);
		}
		items1.remove((Object)25);
		System.out.println("after removing");
		for(Object item:items1) {
			System.out.println(item);
		}
		
		Iterator it=items1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		items1.forEach((item)->System.out.println(item));
		items1.forEach(System.out::println);

	}

}
