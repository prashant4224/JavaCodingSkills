package com.javahungry;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {
		// Q7 Armstrong number?
		// number 370,371, 1 , 153, 407
		int number = 407;
		int original = number;
		int rem, sum=0;
		while (number != 0) {
			rem = number % 10;
			sum = sum + rem * rem * rem;
			number /= 10;
		}
		
		if (sum == original) {
			System.out.println("Given number is Armstrong number: "+ original);
		} else {
			System.out.println("Given number is not Armstrong number: "+ original);
		}

	}

}
