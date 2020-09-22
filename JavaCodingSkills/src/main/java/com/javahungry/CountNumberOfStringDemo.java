package com.javahungry;

public class CountNumberOfStringDemo {

	public static void main(String[] args) {
		// Q5. How to Count number of words in the String?
		String str = "alive is  awesome";
		char[] ch = str.toCharArray();
		String[] strArray = str.trim().split("\\S+");
		System.out.println(strArray.length);
//		for
		

	}

}
