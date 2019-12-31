package com.deloitte;
import java.util.*;
public class EmailSort {

	public static void main(String[] args) {
	List<String> emails= Arrays.asList("abac@gmail.com","cdfg@gmail.com",
				"wgch@hotmail.com","ghrtu@yahoo.com","ijgh@yahoo.com",
				"ghty@rediffmail.com", "rhj@gmail.com","uyrtn@hotmail.com",
				"ojg@reediffmail.com","thhj@yahoo.com");
		
	Map<String,List<String>> emailList=new HashMap<>();
	for(String email:emails) {
		String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
		if(emailList.containsKey(domain)) {
			List<String> em=emailList.get(domain);
			List<String> ems=Arrays.asList(em);
			emailList.get(domain).add(email);
		}		
		else {
			emailList.put(domain, Arrays.asList(email));
		}
	}
	emailList.forEach((d,e)->{
		System.out.println("\n\nDomain : "+d);
		System.out.println("---------------------");
		e.forEach((s)->System.out.println(s));
	});

	}

}
