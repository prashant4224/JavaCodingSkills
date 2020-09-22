package com.javahungry;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		//Q1. How to reverse a String in java?
		// Using toCharArray
		String str1 = "Java SpringBoot";
		String reverse = "";
		
		char[] chrs1 = str1.toCharArray();
		
		for (int i = chrs1.length-1; i >= 0; i--) {
			reverse += str1.charAt(i);
		}
		System.out.println(reverse);

		// Using StringBuilder
		String str2 = "Java SpringBoot Rest";
		StringBuilder builder = new StringBuilder();
		String reverseStr2  = ""; 
		
		builder.append(str2);
		reverseStr2 = builder.reverse().toString();
		
		System.out.println(reverseStr2);

		//
		String str3 = "Java SpringBoot Rest";
		char[] chars3 = str3.toCharArray();
		int right = chars3.length-1; 
		for (int left = 0; left < right; left++, right--) {
			char temp = chars3[left];
			chars3[left] = chars3[right];
			chars3[right] = temp;
			
		}
		
		for (char c : chars3) {
			System.out.print(c);
		}
	}

}
