package com.deloitte;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<Character,Integer>charOccur=new HashMap<>();
		String str="Rahul Shetty";
		for(char c:str.toCharArray()) {
			if(charOccur.containsKey(c)) {
				int occ=charOccur.get(c)+1;
				charOccur.put(c, occ);
			}
			else {
				charOccur.put(c, 1);
			}
		}
		charOccur.forEach((c,occ)->System.out.println(c+" ->"+occ));
		
	}

}
