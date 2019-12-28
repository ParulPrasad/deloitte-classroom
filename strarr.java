package com.deloitte;

public class strarr {

	public static void main(String[] args) {
		String []email= {"abc@gmail.com","cdfg@gmail.com","wgch@hotmail.com",
				 "ghrtu@yahoo.com","ijgh@yahoo.com","ghty@rediffmail.com",
				 "rhj@gmail.com","uyrtn@hotmail.com","ojg@reediffmail.com",
				 "thhj@yahoo.com"};

		String []gmail=new String[11];
		String []yahoo=new String[11];
		String []hotmail=new String[11];
		String []others=new String[11];
		gmail[0]="gmail";
		yahoo[0]="yahoo";
		hotmail[0]="hotmail";
		others[0]="others";
		int j=1;
		for(int i=0;i<10;i++) {
		
			if(email[i].contains("@gmail.com")) {
				
				gmail[j]=email[i];
				j++;
			}
		}
		 j=1;
		for(int i=0;i<10;i++) {
			
			if(email[i].contains("@yahoo.com")) {
				
				yahoo[j]=email[i];
				j++;
			}
		}
		 j=1;
		for(int i=0;i<10;i++) {
			
			if(email[i].contains("@hotmail.com")) {
				
				hotmail[j]=email[i];
				j++;
			}
		}
		 j=1;
		 for(int i=0;i<10;i++) {
				
			 if(!((email[i].contains("@gmail.com") || email[i].contains("@hotmail.com") || email[i].contains("@yahoo.com"))     )) {
				 others[j]=email[i];
					j++;
			 }
		 }
		 for(int i=0;i<11;i++) {
			if(gmail[i]!=null)
				 System.out.printf("%30s",gmail[i]);
			if(yahoo[i]!=null)
				 System.out.printf("%30s",yahoo[i]);
			if(hotmail[i]!=null)
			      System.out.printf("%30s",hotmail[i]);
			 if(others[i]!=null)
				 System.out.printf("%30s",others[i]);
			 System.out.println();
				 
		 }

	}

}
