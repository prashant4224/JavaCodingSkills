package com.javahungry;

import java.util.ArrayList;
import java.util.Collections;

public class StringUniqueCharDemo {

	public static void main(String[] args) {

		// Q4. Find out if String has all Unique Characters?
		
		String str = "twist";
		 boolean b = uniqueChar(str);
		System.out.println(b);
		
	}
	
	public static boolean uniqueChar(String str) {
		
		ArrayList aList = new ArrayList<>();
		
		
		for (int i = 0; i < str.length(); i++) {
						
			int j = str.indexOf(str.charAt(i));
			System.out.println(j);
			aList.add(j);
		}
		Collections.sort(aList);
		System.out.println(aList);
		for (int i = 0; i < (aList.size()-1); i++) {
			if (aList.get(i) == aList.get(i+1)) {
				return false;
			}
			
		}
		return true;
	}

}
