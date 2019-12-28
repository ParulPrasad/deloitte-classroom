package com.deloitte;


public class StringAssignment {

	public static void main(String[] args) {
	 String []email= {"abac@gmail.com","cdfg@gmail.com","wgch@hotmail.com",
			 "ghrtu@yahoo.com","ijgh@yahoo.com","ghty@rediffmail.com",
			 "rhj@gmail.com","uyrtn@hotmail.com","ojg@reediffmail.com",
			 "thhj@yahoo.com"};
	 System.out.println("gmail:");
	 for(int i=0;i<email.length;i++) {
		 
		 if(email[i].contains("@gmail.com")) {
			 System.out.println(email[i]);
			 
		 }
	 }
	 System.out.println("\nyahoo:");
	 for(int i=0;i<email.length;i++) {
		 
		 if(email[i].contains("@yahoo.com")) {
			 System.out.println(email[i]);
			 
		 }
	 }
	 System.out.println("\nhotmail:");
	 for(int i=0;i<email.length;i++) {
		
		 if(email[i].contains("@hotmail.com")) {
			 System.out.println(email[i]);
			 
		 }
	 }
	 System.out.println("\nothers:");
	 for(int i=0;i<email.length;i++) {
		
		 if(!((email[i].contains("@gmail.com") || email[i].contains("@hotmail.com") || email[i].contains("@yahoo.com")) )) {
			 System.out.println(email[i]);
			 
		 }
	 }
		
	}

}
