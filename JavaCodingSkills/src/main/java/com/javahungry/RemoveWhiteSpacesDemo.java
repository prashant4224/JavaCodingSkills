package com.javahungry;

public class RemoveWhiteSpacesDemo {

	public static void main(String[] args) {
		// Q6 How to remove all the white-spaces in the String?
		String str = "    Alive is awesome   ";
		String str1;
		str1 = str.replaceAll("\\s+", "");
		System.out.println(str1);

	}

}
