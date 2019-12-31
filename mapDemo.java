package com.deloitte;
import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		Map<String,String> trainees=new HashMap<>();
		trainees.put("parul", "odisha");
		trainees.put("chetna", "odisha");
		trainees.put("nishitha", "AP");
		trainees.put("tejaswini", "AP");
		System.out.println(trainees.get("parul"));
		 System.out.println("enter name:");
		 String name=new Scanner(System.in).nextLine();
		 System.out.println("location: "+trainees.get(name));

	}

}
