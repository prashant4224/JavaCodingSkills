package com.javahungry.icompass;

import java.util.Comparator;

interface Running {

	void move();
	
	void stop();
}
public class Jogging implements Running{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		int[][] twoDimArray = {{3,2,1}, {5,6,4}, {9,8,7}};
		int[][] sampleArray = new int[5][];
//		int[][] samplArray = new int[][5]; //Invalid
		
		int[][] twoDimArr = {{1}, {4}, {7}};
		
		for (int[] is : twoDimArray) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
//		Comparator c4 = Comparator.comparing(e -> e.size());
//		Comparator.comparing(e -> e.length);
//		(e1, e2) -> Integer::compare;
//		Comparator c4 = (e1, e2) -> e1.length > e2.length;
		
		
	}

	
}

class Rabbit {
	public static void main(String[] args) {
		Rabbit one = new Rabbit(); 
		Rabbit two = new Rabbit(); 
		Rabbit three = one; 
		one = null; 
		Rabbit four = one; 
		three = null; 
		two = null; 
		two = new Rabbit(); 
		System.gc(); 
	} 
}
