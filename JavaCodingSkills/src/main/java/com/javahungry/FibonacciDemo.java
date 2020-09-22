package com.javahungry;

import java.util.Collections;

public class FibonacciDemo {

	
	public static void main(String[] args) {
		// fibonacci
		int a=0, b=1, n=10;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			
			int sum = a +b;
			a = b;
			b = sum;
			
		}
		
		int a1=0, b1=1, n1=10;
		int i = 0;
		System.out.println(" ");
		while (i < n1) {
			System.out.print(a1 + " ");
			
			int sum = a1 +b1;
			a1 = b1;
			b1 = sum;
			i++;
		
		}
		System.out.println("");
		System.out.print(x +" "+ y);
		fib(10-2);
}
	
	static int x=0, y=1, sum=0; 
	public static void fib(int n) {
//		System.out.print(" ");
		if (n > 0) {
			sum = x + y;
			x = y;
			y = sum;
			System.out.print(" "+sum);
			fib(n-1);
			
//			Collections.list(e)
		}
	}

}
