package com.javahungry;

import java.lang.reflect.Array;

public class IntersectTwoArray {

	public static void main(String[] args) {

		//Q3. How to find intersection of two arrays in java?
		int[] array1 = {1,4,7,9,2};
		int[] array2 = {1,7,3,4,5};
		
		int[] array3 = new int[array1.length];
		int c = 0;
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					array3[c] = array1[i];
					c++;
				} else {
					continue;
				}
			}
		}
		
		for (int k = 0; k < c; k++) {
			System.out.println(array3[k]);
		}
		

	}

}
