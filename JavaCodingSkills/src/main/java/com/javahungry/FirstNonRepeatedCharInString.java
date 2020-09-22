package com.javahungry;

import java.util.HashMap;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		String str = "testing the Java";
		Character ch = firstNonRepeatString(str);
		System.out.println(ch);
	}
	
	public static Character firstNonRepeatString(String str) {
		//Q2. How to find the first non repeated character in the String?
		
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] chars = str.toCharArray();
		char ch;
		
		for (char c : chars) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, 1);
			}
		}
		
		for (int i = 0; i < chars.length; i++) {
			ch = str.charAt(i);
			if (hm.get(ch) == 1) {
				return ch;
			}
		}
		return null;

	}

}
